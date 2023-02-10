package br.ifsertaope.campussalgueiro.projetolavarapido.entity;

import org.springframework.stereotype.Component;

@Component
public class Notification {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
