package br.ifsertaope.campussalgueiro.projetolavarapido.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.ifsertaope.campussalgueiro.projetolavarapido.entity.LavaRapidoEntity;
import br.ifsertaope.campussalgueiro.projetolavarapido.repository.LavaRapidoRepository;

@RestController
public class LavaRapidoController {

    @Autowired LavaRapidoRepository acao;

    @PostMapping("/lavarapido/create")
    public LavaRapidoEntity create(@RequestBody LavaRapidoEntity v){
        return acao.save(v);
    }

    @GetMapping("/lavarapido/select")
    public List<LavaRapidoEntity> select(){
        return acao.findAll();
    }
    
    @GetMapping("/lavarapido/select/{id}")
    public LavaRapidoEntity selectById(@PathVariable int id){
        return acao.findById(id);
    }

    @PostMapping("/lavarapido")
    public LavaRapidoEntity lavarapido(@RequestBody LavaRapidoEntity v){
        return v;
    }

    @PutMapping("/lavarapido/update")
    public LavaRapidoEntity update(@RequestBody LavaRapidoEntity v){
        return acao.save(v);
    }

    @DeleteMapping("lavarapido/delete/{id}")
    public void delete(@PathVariable int id){
        LavaRapidoEntity v = selectById(id);

        acao.delete(v);
    }

    @GetMapping("lavarapido/counter")
    public Long counter (){
        return acao.count();
    }

    
    
}
