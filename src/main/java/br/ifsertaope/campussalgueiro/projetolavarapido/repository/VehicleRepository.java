package br.ifsertaope.campussalgueiro.projetolavarapido.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import br.ifsertaope.campussalgueiro.projetolavarapido.entity.VehicleEntity;

@Component
public interface VehicleRepository extends JpaRepository< VehicleEntity , Integer> {
    
    List<VehicleEntity> findAll();

    VehicleEntity findById(int id);



}
