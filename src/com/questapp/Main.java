package com.questapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        //tworzymy obiekt naszej klasy, aby uzyc klasy Party w Main
        //obiekt tworzy sie za pomoca new, i wywolujemy konstruktor obiektu

        Party party = new Party();//jak nie ma konstruktora, to jest on domyslny czyli w party mamy pusto ()

        while(shouldContinue){
            System.out.println("Wybierz opcje");
            System.out.println("1. Wyswietl gosci");
            System.out.println("2. Dodaj goscia");
            System.out.println("3. Wyswietl potrawy");
            System.out.println("4. Znajdz po numerze telefonu");
            System.out.println("5. Wyjscie");

            int userChoice = scanner.nextInt();
        //switch

            switch (userChoice) {
                case 1 -> party.displayGuests();
                case 2 -> party.addGuest();
                case 3 -> party.displayMeals();
                case 4 -> party.displayGuestByPhoneNumber();
                case 5 -> shouldContinue = false;
            }

        }
    }
}
