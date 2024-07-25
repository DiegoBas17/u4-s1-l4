package entities;

import enums.TipoDipendente;

public class DipendentePartTime extends Dipendente {
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
}
