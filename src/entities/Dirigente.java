package entities;

import enums.TipoDipendente;

public class Dirigente extends Dipendente {
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
}
