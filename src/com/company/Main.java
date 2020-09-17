package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //break i continue

        for (int i = 0;i < 10;i++){
            if (i==4){;
                break;
            }
            System.out.println(i);
        }






        //petla do while

        /**boolean skyIsBlue = false;
        do {
            System.out.println("Niebo jest niebieskie");
        }
        while (skyIsBlue);**/


        //petla while if for

        /**int i = 10;
        while (i<20){
            System.out.println(i);
            i++;
            if (i==19) {
                for (;i<30;i++){
                    System.out.println(i);
                };
            }
        }**/



        //petla for

        /**int i = 10;
        for (;i <= 120;) {
            System.out.println(i);
            i += 2;
        }**/



        //instrukcja warunkowa

        /**Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Jestes pełnoletni");
        } else{
            System.out.println("Jestes niepelnoletni");
        } **/


        /**
         * System.out.println("Podaj imie: ");
        String name = scanner.nextLine();

        System.out.println("siema " + name);

        if (!name.isEmpty() && (!name.endsWith("a") || name.equals("Barnaba"))) {
            System.out.println("Jestes mezczyzna");

        } else if (!name.isEmpty() && name.endsWith("a")) {
            System.out.println("Jestes kobieta");
        } else {
            System.out.println("Imie nie moze byc puste");
        } **/
    }
}
