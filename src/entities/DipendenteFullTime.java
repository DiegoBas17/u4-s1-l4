package entities;

import enums.TipoDipendente;
import interfaces.CheckIn;

import java.time.LocalDateTime;

public class DipendenteFullTime extends Dipendente implements CheckIn {
    /*ATTRIBUTI*/
    private int oreLavorate;

    /*COSTRUTTI*/
    public DipendenteFullTime(String matricola, double stipendio, TipoDipendente dipartimento) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = 40;
    }

    /* METODI */
    @Override
    public void calculateSalary() {
        System.out.println("Lo stipendio di un dipendente Full Time è di: " + getStipendio() + "€ per un ammontare di ore pari a: " + this.oreLavorate);
    }

    @Override
    public void checkIn() {
        System.out.println(LocalDateTime.now());
    }
}
