package com.pluralsight.calculator;

import java.util.Scanner;
public class MortgageCalculator {



    public static void main(String[] args) {

        double principle = 0.0;
        double interestRate = 0.0;
        int loanLength = 0;


        Scanner calculatorScanner = new Scanner(System.in);

        System.out.println("Enter your Principle Here: ");
        principle = calculatorScanner.nextDouble();

        System.out.println("Enter your Interest Rate Here: ");
        interestRate = calculatorScanner.nextDouble() / 100;

        System.out.println("Enter your loan length Here: ");
        loanLength = calculatorScanner.nextInt();

        double numerator = principle * interestRate/12;
        double a = 1 + interestRate/12;
        double b = - loanLength * 12;
        double months = loanLength * 12;
        double p = Math. pow(a, b);
        double denominator = 1 - p;
        double payment = numerator/denominator;
        double amountTotal = (payment * months);
        double amount = (amountTotal - principle);

        System.out.println("Your monthly payment is: " + payment);
        System.out.println("Total Interest paid: " + amount);

        calculatorScanner.close();
    }


    }


