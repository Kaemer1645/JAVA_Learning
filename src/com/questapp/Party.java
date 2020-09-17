package com.questapp;

import java.util.*;

public class Party {
    // ta metoda jest prywatna bo pola klasy powinny byc prywatne - taka jest konwencja
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> phoneToGuest = new HashMap<>();


    Scanner scanner = new Scanner(System.in);
    //ta metoda jest publiczna, zeby dodawac gosci z innych klas do listy
    //void - nie zwracamy zadnego typu
    public void addGuest(){

        System.out.println("Podaj imie goscia");
        String name = scanner.nextLine();

        System.out.println("Podaj preferowany posiłek");
        String meal = scanner.nextLine();

        System.out.println("Podaj numer telefonu");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Czy jest weganinem? (Y/N)");
        String isVeganString = scanner.nextLine();

        boolean isVegan;

        if (isVeganString.equals("Y")){
            isVegan = true;
        }
        else {
            isVegan = false;
        }


        Guest guest = new Guest(name, meal, phoneNumber, isVegan);
        meals.add(meal);
        phoneToGuest.put(phoneNumber,guest);
        guests.add(guest);

    }

    public void displayMeals(){
        for (String meal : meals){
            System.out.println(meal);
        }
    }

    public void displayGuestByPhoneNumber(){
        System.out.println("Podaj numer telefonu");
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        Guest guest = phoneToGuest.get(phoneNumber);
        guest.displayGuestInformation();

    }

    // metoda zwracajaca liste gosci
    public void displayGuests(){
        for (Guest guest : guests){
            guest.displayGuestInformation();
            System.out.println();
        }
    }
}
