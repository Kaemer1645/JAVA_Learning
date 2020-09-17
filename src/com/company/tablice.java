package com.company;

import java.util.*;

public class tablice {
    public static void main(String[] args) {
//        String[] names = new String[4];
//        String[] names = {"Mariusz","Basia","Kasia","Asia"};
//        names[0] = "Mariusz Stykala";
//        names[1] = "Justyna K.";
//        names[2] = "Asia";
//        names[3] = "Joshua";

        //petla for
//        for (int i = 0;i<names.length;i++){
//            System.out.println(names[i]);

        //petla for each

//        for (String name : names) {
//            System.out.println(name);

/*// array lista

        *//*List<String> names = new ArrayList<>();
        names.add("Mariusz");
        names.add("Katarzyna");
        names.add("Justyna");


//        System.out.println(names.get(1));

        names.add("Mariusz");
//        names.remove("Mariusz");

//        names.clear();
        Collections.sort(names);
        System.out.println(names.isEmpty());
//        names.remove("Mariusz");
//        System.out.println(names.contains("Justyna"));
        for (String name :names){
            System.out.println(name);*//*
        }*/

        /*//SET
        Set<String> meals = new HashSet<>();

        meals.add("Fajitas");
        meals.add("Pizza");
        meals.add("Pizza");

        for (String meal : meals){
            System.out.println(meal);
        }*/




        //Hashmap
        Map<String, String> nameToMeal = new HashMap<>();

        nameToMeal.put("Maciej","Pizza");
        nameToMeal.put("Kamila","Salad");
        nameToMeal.put("Gosia","Kanapki");

        System.out.println(nameToMeal.get("Kamila"));
//        nameToMeal.clear();

//        System.out.println(nameToMeal.isEmpty());
        /*Set<String> keys = nameToMeal.keySet();
        for (String key:keys) {
            System.out.println(key);*/


        Collection<String> values = nameToMeal.values();
        for (String value:values) {
            System.out.println(value);

        }
        System.out.println(nameToMeal.containsKey("Mariusz"));
        System.out.println(nameToMeal.containsValue("Pierogies"));

    }
}


