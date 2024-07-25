package entities;

import interfaces.CheckIn;

import java.time.LocalDateTime;

public class Volontario implements CheckIn {
    /*ATTRIBUTI*/
    public String nome;
    public int eta;
    public String cv;

    /*COSTRUTTI*/
    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    /* METODI */
    @Override
    public void checkIn() {
        System.out.println(LocalDateTime.now());
    }


}
