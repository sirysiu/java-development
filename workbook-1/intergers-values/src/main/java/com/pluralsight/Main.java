package com.pluralsight;


import java.util.Scanner;

public class Main {
    static int a = 0;
    static int b = 0;

    public static int getTotal(int num) {
        return a + b;
    }

    public static void main(String[] args) {


        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Type First Numeric value to add");
        int a = inputScanner.nextInt();


        System.out.println("Type Second Numeric value to add");
        int b = inputScanner.nextInt();


        int total = (a + b);

        System.out.println("Total of numbers: " + total);

        inputScanner.close();
    }
}