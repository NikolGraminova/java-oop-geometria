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

        System.out.println("Enter width: ");
        int widthInput = Integer.parseInt(scan.nextLine());

        System.out.println("Enter height: ");
        int heightInput = Integer.parseInt(scan.nextLine());

        Rectangle myRectangle = new Rectangle(widthInput, heightInput);

        // STAMPA
        System.out.println("The area is: " + myRectangle.getArea());
        System.out.println("The perimeter is: " + myRectangle.getPerimeter());

        myRectangle.draw('o');
    }
}

