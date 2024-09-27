package com.pluralsight.donut;

// We Love our Delimiters
/*
{} Curly Brackets
    Surround:
     Method Body
     Class Declaration
     Array initializer
[] Square Bracket
    Array Declaration
    Array Access
<> Pointy Brackets
    Template parameters list
() Parentheses
    Parameters list for a method
; Semicolon
    End Statement

 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Donut {
    static double price = .25;

    public static double getTotal(int numOfDonuts) {
        return numOfDonuts * price;
    }

    public static void main(String[] args) {

        //System.out.println("A Dozen Of Donuts Cost: " + getTotal(12) + " Dollars");
        //System.out.println(getTotal(12) + " Dollars");
        //System.out.print("This my \nformat string ");
        Scanner inputScanner = new Scanner(System.in);


        System.out.print("Welcome! How many donuts do you want?: ");
        int numberOfDonuts = inputScanner.nextInt();
        inputScanner.nextLine();

        double total = getTotal(numberOfDonuts);

        System.out.println("This much donut cost:");


        //System.out.printf("In Dollars, that would be $%8.2f\n", getTotal(12));
        System.out.printf("In Dollars, that would be $%8.2f\n", + total);
        //System.out.printf("In Dollars, that would be $%8.2f\n", getTotal(12000));

       //System.out.printf("The Square root of 5 is %8.15f\n", Math.sqrt(5.0));
    }
}
