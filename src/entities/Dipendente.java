package entities;

import enums.TipoDipendente;

public abstract class Dipendente {
    /*ATTRIBUTI*/
    private String matricola;
    private double stipendio;
    private TipoDipendente dipartimento;

    /*COSTRUTTI*/
    public Dipendente(String matricola, double stipendio, TipoDipendente dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    /* METODI */
    public abstract void calculateSalary();

    public String getMatricola() {
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
