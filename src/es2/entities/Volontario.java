package es2.entities;

import interfaces.Start;

public class Volontario implements Start {
    private String nome;
    private int eta;
    private String CV;

    public Volontario(String nome, int eta, String CV) {

        this.nome = nome;
        this.eta = eta;
        this.CV = CV;
    }

    @Override
    public void checkin() {
        System.out.println("Servizio iniziato alle ore : 12");
    }

  
}
