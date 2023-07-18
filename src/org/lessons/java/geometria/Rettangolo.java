package org.lessons.java.geometria;

/*
*Nome repo: java-oop-geometria
*Consegna: Nel progetto java-oop-geometria creare un package org.lessons.java.geometria, in cui inserire le classi:
*una classe Rettangolo con due attributi interi: base e altezza. Aggiungere un opportuno costruttore con parametri.
*Aggiungere due metodi: calcolaArea e calcolaPerimetro che calcolano e restituiscono, rispettivamente, l’area e il perimetro del rettangolo.
 */


public class Rettangolo {
    // VARIABILI
    int base;
    int altezza;
    double area;
    double perimetro;

    // COSTRUTTORI
    Rettangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;

    }

    //METODI
    //calcolaArea(){

    //}

    //calcolaPerimetro(){

    //}

    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
