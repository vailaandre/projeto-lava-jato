package br.ifsertaope.campussalgueiro.projetolavarapido.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.ifsertaope.campussalgueiro.projetolavarapido.entity.Notification;
import br.ifsertaope.campussalgueiro.projetolavarapido.entity.VehicleEntity;
import br.ifsertaope.campussalgueiro.projetolavarapido.repository.VehicleRepository;

@Service
public class VehicleService {

    @Autowired
    private Notification notification;

    @Autowired 
    private VehicleRepository action;

    public ResponseEntity<?> save(VehicleEntity v){
        if(v.getPlate().equals("")){
            notification.setMessage("Informe o placa!");
            return new ResponseEntity<>(notification, HttpStatus.BAD_REQUEST);
        }else if(v.getConductor().equals("")){
            notification.setMessage("Informe o nome do(a) condutor do veiculo!");
            return new ResponseEntity<>(notification, HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity<>(action.save(v), HttpStatus.CREATED);
        }
    }

    public ResponseEntity<?> find(){
        return new ResponseEntity<>(action.findAll(), HttpStatus.OK);
    }

    


     

}
