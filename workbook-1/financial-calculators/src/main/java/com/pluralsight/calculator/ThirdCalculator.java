package com.pluralsight.calculator;

import java.util.Scanner;

public class ThirdCalculator {

    public static void main(String[] args) {
        double payout = 0.0F;
        double interestRate = 0.0f;
        int numOfYears = 0;

        Scanner calculatorScanner = new Scanner(System.in);

        System.out.println("Enter your deposit Here: ");
        payout = calculatorScanner.nextFloat();


        System.out.println("Enter your Interest Rate Here: ");
        interestRate = calculatorScanner.nextFloat() / 100;


        System.out.println("Enter your Years Here: ");
        numOfYears = calculatorScanner.nextInt();


        double numerator = 1 - Math.pow(1 + interestRate, -numOfYears);
        double yearAmount = payout * 12;
        double annuity = yearAmount * (numerator/interestRate);

        System.out.println("The annuity is: " + annuity);
        calculatorScanner.close();
    }

}