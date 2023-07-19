package org.lessons.java.geometria;

/*
*Nome repo: java-oop-geometria
*Consegna: Nel progetto java-oop-geometria creare un package org.lessons.java.geometria, in cui inserire le classi:
*una classe Rettangolo con due attributi interi: base e altezza. Aggiungere un opportuno costruttore con parametri.
*Aggiungere due metodi: calcolaArea e calcolaPerimetro che calcolano e restituiscono, rispettivamente, l’area e il perimetro del rettangolo.
 */


public class Rectangle {
    // VARIABILI
    int width;
    int height;

    // COSTRUTTORI
    Rectangle(int base, int altezza){
        this.width = base;
        this.height = altezza;
    }

    // METODI
    double getArea(){
        return width * height;
    }

    double getPerimeter(){
        return 2 * (width + height);
    }

    void draw(char marker){

        for (int i = 0; i < width; i++){
            System.out.print(marker);
        }

        System.out.println();

        for (int i = 0; i < height-2; i++){
            System.out.print(marker);
            for (int j = 0; j < width - 2;j++){
                System.out.print(" ");
            }
            System.out.println(marker);
        }

        for (int i = 0; i < width; i++){
            System.out.print(marker);
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

