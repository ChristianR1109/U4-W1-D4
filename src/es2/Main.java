package es2;

import es2.entities.*;
import interfaces.Start;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dirigente Giacomino = new Dirigente("M2938832", 1390.0, Dipartimento.AMMINISTRAZIONE, 70.0);
        DipendentePartTime Sandro = new DipendentePartTime("M1234567", 1490.0, Dipartimento.AMMINISTRAZIONE, 120, 35.0);
        DipendenteFullTime Mario = new DipendenteFullTime("M1029384", 1290.0, Dipartimento.VENDITE, 50.0);


        Volontario Franco = new Volontario("Franco", 22, "CV1");
        Volontario Ernesto = new Volontario("Ernesto", 31, "CV2");
        Start[] dipendenti = {Giacomino, Sandro, Mario, Franco, Ernesto};
        for (int i = 0; i < dipendenti.length; i++) {
        

            dipendenti[i].checkin();
        }
    }
}