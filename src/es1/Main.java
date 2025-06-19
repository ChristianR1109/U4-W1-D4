package es1;

import es1.entities.Dipartimento;
import es1.entities.Dipendente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dipendente Giacomino = new Dipendente("M2938832", 1390, Dipartimento.PRODUZIONE);
        Dipendente Sandro = new Dipendente("M1234567", 1490, Dipartimento.AMMINISTRAZIONE);
        Dipendente Mario = new Dipendente("M1029384", 1290, Dipartimento.VENDITE);

        Dipendente[] dipendenti = {Giacomino, Sandro, Mario};
        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println(dipendenti[i]);
        }
    }
}