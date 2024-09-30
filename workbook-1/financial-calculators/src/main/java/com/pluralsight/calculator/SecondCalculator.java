package com.pluralsight.calculator;

import java.util.Scanner;

public class SecondCalculator {

    public static void main(String[] args) {
        float deposit = 0.0F;
        float interestRate = 0.0f;
        int numOfYears = 0;

        Scanner calculatorScanner = new Scanner(System.in);

        System.out.println("Enter your deposit Here: ");
        deposit = calculatorScanner.nextFloat();


        System.out.println("Enter your Interest Rate Here: ");
        interestRate = calculatorScanner.nextFloat() / 100 ;


        System.out.println("Enter your Years Here: ");
        numOfYears = calculatorScanner.nextInt();





        double simpleInterest = deposit * (Math.pow(1 + interestRate, numOfYears));
        double totalInterest = (simpleInterest - deposit);

        System.out.println("Your CD Balance is: " + simpleInterest);
        System.out.println("You would have earn: " + totalInterest);

        calculatorScanner.close();

    }
}
