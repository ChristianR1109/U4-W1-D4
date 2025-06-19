package es2.entities;

import interfaces.Start;

public abstract class Dipendente implements Start {
    protected String matricola;
    protected Double stipendio;
    protected Dipartimento dipartimento;

    public Dipendente(String matricola, Double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;

    }

    protected Dipendente() {
    }


    abstract public void calculateSalary();

    abstract public void parla();

    public String getMatricola() {
        return matricola;
    }

    public Double getStipendio() {
        return stipendio;
    }

    public es2.entities.Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +

                '}';
    }


}
