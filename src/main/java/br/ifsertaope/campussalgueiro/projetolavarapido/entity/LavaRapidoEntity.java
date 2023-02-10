package br.ifsertaope.campussalgueiro.projetolavarapido.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_lavarapido")
public class LavaRapidoEntity {

    private static LavaRapidoEntity instance = null;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String phone;

    private LavaRapidoEntity() {}

    public synchronized static LavaRapidoEntity getInstance() {
        if (instance == null) {
            instance = new LavaRapidoEntity();
        }
        return instance;
    }

    //Get e Set
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    

    
    
}
