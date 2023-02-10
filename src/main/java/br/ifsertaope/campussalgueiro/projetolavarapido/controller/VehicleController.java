package br.ifsertaope.campussalgueiro.projetolavarapido.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.ifsertaope.campussalgueiro.projetolavarapido.entity.VehicleEntity;
import br.ifsertaope.campussalgueiro.projetolavarapido.repository.VehicleRepository;
import br.ifsertaope.campussalgueiro.projetolavarapido.service.VehicleService;

@RestController
public class VehicleController {

    @Autowired 
    VehicleRepository action;

    @Autowired 
    VehicleService service;

    @PostMapping("/vehicle/create")
    public ResponseEntity<?> create(@RequestBody VehicleEntity v){
        return service.save(v);
    }

    @GetMapping("/vehicle/select")
    public ResponseEntity<?> select(){
        return service.find();
    }

    @GetMapping("/vehicle/select/{id}")
    public VehicleEntity selectById(@PathVariable int id){
        return action.findById(id);
    }


    @PutMapping("/vehicle/update")
    public VehicleEntity update(@RequestBody VehicleEntity v){
        return action.save(v);
    }

    @DeleteMapping("vehicle/delete/{id}")
    public void delete(@PathVariable int id){
        VehicleEntity v = selectById(id);

        action.delete(v);
    }

    @GetMapping("vehicle/counter")
    public Long counter (){
        return action.count();
    }

    @GetMapping("/status")
    public ResponseEntity<?> status(){
         return new ResponseEntity<>(HttpStatus.CREATED);
    }
        
    

    
    
}
