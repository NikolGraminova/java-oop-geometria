package org.lessons.java.geometria;

/*
*Creare una classe Main contenente il metodo main(), nel quale chiedete all’utente di inserire, da console, i valori di base e di altezza con cui istanziare un nuovo Rettangolo.
* Dopo averlo istanziato, stampate a video il perimetro e l’area.
*BONUS Aggiungere alla classe Rettangolo un metodo disegna() che stampa in console il rettangolo con le sue dimensioni, come nell’immagine allegata
 */

public class Main {
    public static void main(String[] args) {
        Rettangolo mioRettangolo = new Rettangolo(20,5);
        System.out.println(mioRettangolo);

    }
}
