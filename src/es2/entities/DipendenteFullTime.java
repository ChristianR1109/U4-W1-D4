package es2.entities;

import interfaces.Start;

public class DipendenteFullTime extends Dipendente implements Start {

    private Double pagaGior;

    public DipendenteFullTime(String matricola, Double stipendio, Dipartimento dipartimento, Double pagaGior) {
        super(matricola, stipendio, dipartimento);
        this.pagaGior = pagaGior;
    }

    @Override
    public void calculateSalary() {
        Double totale = pagaGior * 30;
        System.out.println(totale);
    }

    public void parla() {
        System.out.println("DipendenteFullTime");
    }

    @Override
    public void checkin() {
        System.out.println("Turno di lavoro iniziato alle ore : 13");
    }
}
