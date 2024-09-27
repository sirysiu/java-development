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
        calculatorScanner.nextLine();

        System.out.println("Enter your Interest Rate Here: ");
        interestRate = calculatorScanner.nextFloat();
        calculatorScanner.nextLine();

        System.out.println("Enter your Years Here: ");
        numOfYears = calculatorScanner.nextInt();
        calculatorScanner.nextLine();

        double simpleInterest = Math.pow(1 + interestRate, numOfYears);

        System.out.println("Simple Interest: " + simpleInterest);

        calculatorScanner.close();

    }
}
