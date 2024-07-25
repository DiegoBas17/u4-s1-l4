package entities;

import enums.TipoDipendente;
import interfaces.CheckIn;

import java.time.LocalDateTime;

public class Dirigente extends Dipendente implements CheckIn {
    /*ATTRIBUTI*/
    private String oreLavorate;

    /*COSTRUTTI*/
    public Dirigente(String matricola, double stipendio, TipoDipendente dipartimento) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = "tutte quelle che servono";
    }

    /* METODI */
    @Override
    public void calculateSalary() {
        System.out.println("Lo stipendio di un Dirigente è di: " + getStipendio() + "€ per un ammontare di ore pari a: " + this.oreLavorate);
    }

    @Override
    public void checkIn() {
        System.out.println(LocalDateTime.now());
    }
}
