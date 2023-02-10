package br.ifsertaope.campussalgueiro.projetolavarapido.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_vehicle")
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String plate;
    private String conductor;
    private String phone;

    //Get e Set
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPlate() {
        return plate;
    }
    public String getConductor() {
        return conductor;
    }
    public String getPhone() {
        return phone;
    }
    

    
    
}
