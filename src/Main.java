import entities.Dipendente;
import entities.DipendenteFullTime;
import entities.DipendentePartTime;
import entities.Dirigente;
import enums.TipoDipendente;

public class Main {
    public static void main(String[] args) {
        DipendentePartTime aldo = new DipendentePartTime("ah23bjak", 1200, TipoDipendente.PRODUZIONE);
        DipendenteFullTime giovanni = new DipendenteFullTime("acujabp544", 2500, TipoDipendente.VENDITE);
        Dirigente giacomo = new Dirigente("af4a2f", 3000, TipoDipendente.AMMINISTRAZIONE);
        Dipendente[] aldoGiovanniGiacomoSRL = {aldo, giovanni, giacomo};
        for (int i = 0; i < aldoGiovanniGiacomoSRL.length; i++) {
            System.out.println(aldoGiovanniGiacomoSRL[i].getMatricola());
            aldoGiovanniGiacomoSRL[i].calculateSalary();
        }
    }
}