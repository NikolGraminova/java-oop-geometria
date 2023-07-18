package org.lessons.java.geometria;

/*
*Creare una classe Main contenente il metodo main(), nel quale chiedete all’utente di inserire, da console, i valori di base e di altezza con cui istanziare un nuovo Rettangolo.
*Dopo averlo istanziato, stampate a video il perimetro e l’area.
*BONUS Aggiungere alla classe Rettangolo un metodo disegna() che stampa in console il rettangolo con le sue dimensioni.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ISTANZA RETTANGOLO
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una base: ");
        int baseInput = Integer.parseInt(scan.nextLine());

        System.out.println("Inserisci un'altezza: ");
        int altezzaInput = Integer.parseInt(scan.nextLine());

        Rettangolo mioRettangolo = new Rettangolo(baseInput, altezzaInput);

        // STAMPA
        System.out.println("L'area del rettangolo è: " + mioRettangolo.calcolaArea());
        System.out.println("Il perimetro del rettangolo è: " + mioRettangolo.calcolaPerimetro());

        mioRettangolo.disegna();
    }
}
