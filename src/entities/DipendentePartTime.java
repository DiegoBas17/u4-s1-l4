package entities;

import enums.TipoDipendente;
import interfaces.Ingresso;

import java.time.LocalDateTime;

public class DipendentePartTime extends Dipendente implements Ingresso {
    /*ATTRIBUTI*/
    private int oreLavorate;

    /*COSTRUTTI*/
    public DipendentePartTime(String matricola, double stipendio, TipoDipendente dipartimento) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = 20;
    }

    /* METODI */
    @Override
    public void calculateSalary() {
        System.out.println("Lo stipendio di un dipendente Part Time è di: " + getStipendio() + "per un ammontare di ore pari a: " + this.oreLavorate);
    }

    @Override
    public void checkIn() {
        System.out.println(LocalDateTime.now());
    }
}
