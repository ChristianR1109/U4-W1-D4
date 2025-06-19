package es2.entities;

import interfaces.Start;

public class DipendentePartTime extends Dipendente implements Start {

    private int oreDiLav;
    private Double pagaOr;

    public DipendentePartTime(String matricola, Double stipendio, Dipartimento dipartimento, int oreDiLav, Double pagaOr) {
        super(matricola, stipendio, dipartimento);

        this.oreDiLav = oreDiLav;
        this.pagaOr = pagaOr;
    }

    @Override
    public void calculateSalary() {
        Double totale = oreDiLav * pagaOr;
        System.out.println(totale);

    }

    public void parla() {
        System.out.println("DipendentePartTime");
    }

    @Override
    public void checkin() {
        System.out.println("Turno di lavoro iniziato alle ore : 14");
    }
}
