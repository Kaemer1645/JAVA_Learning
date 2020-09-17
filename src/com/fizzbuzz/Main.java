package com.fizzbuzz;

public class Main {
    public static void main(String[] args) {
        for (int i = 0;i<101;i++){
            if ((i % 3 == 0)  && (i % 5 == 0)) {
                System.out.println("Fizz and Buzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz "+i);
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz "+i);
            }
            else {
                System.out.println(i);
            }
        }
    }
}
