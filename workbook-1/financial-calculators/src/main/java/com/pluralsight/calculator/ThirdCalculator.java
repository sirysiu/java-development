package com.pluralsight.calculator;

import java.util.Scanner;

public class ThirdCalculator {

    public static void main(String[] args) {
        double payout = 0.0;
        double interestRate = 0.0;
        int numOfYears = 0;

        Scanner calculatorScanner = new Scanner(System.in);

        System.out.println("Enter your payout Here: ");
        payout = calculatorScanner.nextDouble();


        System.out.println("Enter your Interest Rate Here: ");
        interestRate = calculatorScanner.nextDouble() / 100;


        System.out.println("Enter your Years Here: ");
        numOfYears = calculatorScanner.nextInt();

        double r = interestRate / 12;
        double n = -numOfYears * 12;
        double numerator = 1 - Math.pow(1 + r, n);
        //double presentValue = payout * 12;
        double annuity = payout * (numerator / r);

        System.out.printf("The Present Value is: " + "%.2f\n", annuity);
        calculatorScanner.close();
    }

}