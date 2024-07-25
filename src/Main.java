import entities.Dipendente;
import enums.TipoDipendente;

public class Main {
    public static void main(String[] args) {
        Dipendente aldo = new Dipendente("ah23bjak", 1200, TipoDipendente.PRODUZIONE);
        Dipendente giovanni = new Dipendente("acujabp544", 2500, TipoDipendente.VENDITE);
        Dipendente giacomo = new Dipendente("af4a2f", 3000, TipoDipendente.AMMINISTRAZIONE);
        Dipendente[] aldoGiovanniGiacomoSRL = {aldo, giovanni, giacomo};
        for (int i = 0; i < aldoGiovanniGiacomoSRL.length; i++) {
            System.out.println(aldoGiovanniGiacomoSRL[i].getMatricola());
        }
    }
}