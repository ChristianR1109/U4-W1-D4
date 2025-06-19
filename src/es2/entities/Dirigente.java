package es2.entities;

import interfaces.Start;

public class Dirigente extends Dipendente implements Start {
    private Double pagaGior;

    public Dirigente(String matricola, Double stipendio, Dipartimento dipartimento, Double pagaGior) {
        super(matricola, stipendio, dipartimento);

        this.pagaGior = pagaGior;
    }

    @Override
    public void calculateSalary() {
        double totale = pagaGior * 30;
        System.out.println(totale);
    }

    public void parla() {
        System.out.println("Dirigente");
    }

    @Override
    public void checkin() {
        System.out.println("Turno di lavoro iniziato alle ore : 15");
    }
}
