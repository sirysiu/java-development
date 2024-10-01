package com.pluralsight.calculator;

import java.util.Scanner;

public class SecondCalculator {

    public void secondInput() {
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

        double a = 1 + interestRate/365;
        double b = 365 * numOfYears;
        double future = deposit * (Math.pow(a,b));
        double totalInterest = (future - deposit);

        System.out.printf("Your CD Balance is: " + "%.2f\n", future);
        System.out.printf("You would have earn: " + "%.2f\n", totalInterest);

        calculatorScanner.close();

    }
}
