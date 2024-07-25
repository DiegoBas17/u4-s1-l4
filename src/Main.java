import entities.*;
import enums.TipoDipendente;
import interfaces.Ingresso;

public class Main {
    public static void main(String[] args) {
        DipendentePartTime aldo = new DipendentePartTime("ah23bjak", 1200, TipoDipendente.PRODUZIONE);
        DipendenteFullTime giovanni = new DipendenteFullTime("acujabp544", 2500, TipoDipendente.VENDITE);
        Dirigente giacomo = new Dirigente("af4a2f", 3000, TipoDipendente.AMMINISTRAZIONE);
      /*  Dipendente[] aldoGiovanniGiacomoSRL = {aldo, giovanni, giacomo};
        for (int i = 0; i < aldoGiovanniGiacomoSRL.length; i++) {
            System.out.println(aldoGiovanniGiacomoSRL[i].getMatricola());
            aldoGiovanniGiacomoSRL[i].calculateSalary();
        }*/
        Volontario mentor = new Volontario("gabriel", 26, "è un bravo guaglione!");
        Ingresso[] azienda = {aldo, giovanni, giacomo, mentor};
        for (int i = 0; i < azienda.length; i++) {
            if (azienda[i] instanceof Dipendente) {
                Dipendente dipendente = (Dipendente) azienda[i];
                System.out.println(dipendente.getMatricola());
                dipendente.calculateSalary();
            }
            azienda[i].checkIn();
        }
    }
}