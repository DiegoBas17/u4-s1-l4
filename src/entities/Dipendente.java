package entities;

import enums.TipoDipendente;

import java.util.Random;

public abstract class Dipendente {
    /*ATTRIBUTI*/
    private String matricola;
    private double stipendio;
    private TipoDipendente dipartimento;

    /*COSTRUTTI*/
    public Dipendente(String matricola, double stipendio, TipoDipendente dipartimento) {
        this.matricola = randomString(10);
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public static String randomString(int length) {
        Random rnd = new Random();
        char[] arr = new char[length];

        for (int i = 0; i < length; i++) {
            int n = rnd.nextInt(36);
            arr[i] = (char) (n < 10 ? '0' + n : 'a' + n - 10);
        }

        return new String(arr);
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
