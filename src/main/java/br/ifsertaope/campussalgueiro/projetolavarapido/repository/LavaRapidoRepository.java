package br.ifsertaope.campussalgueiro.projetolavarapido.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import br.ifsertaope.campussalgueiro.projetolavarapido.entity.LavaRapidoEntity;

@Component
public interface LavaRapidoRepository extends JpaRepository< LavaRapidoEntity , Integer> {
    
    List<LavaRapidoEntity> findAll();

    LavaRapidoEntity findById(int id);

    


}
