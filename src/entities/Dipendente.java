package entities;

import enums.TipoDipendente;

import java.util.Random;

public abstract class Dipendente {
    /*ATTRIBUTI*/
    private int matricola;
    private double stipendio;
    private TipoDipendente dipartimento;

    /*COSTRUTTI*/
    public Dipendente(String matricola, double stipendio, TipoDipendente dipartimento) {
        Random random = new Random().
        this.matricola = (int) Math.floor(Math.random() * 1000);
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    /* METODI */
    public abstract void calculateSalary();

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public TipoDipendente getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(TipoDipendente dipartimento) {
        this.dipartimento = dipartimento;
    }
}
