package com.pluralsight.calculator;

import java.util.Scanner;
public class MortgageCalculator {



    public static void main(String[] args) {
        double totalInterest = 0.0;
        double principle = 0.0;
        double interestRate = 0.0;
        int loanLength = 0;


        Scanner calculatorScanner = new Scanner(System.in);

        System.out.println("Enter your Principle Here: ");
        principle = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();

        System.out.println("Enter your Interest Rate Here: ");
        interestRate = calculatorScanner.nextDouble() / 100;
        calculatorScanner.nextLine();

        System.out.println("Enter your loan length Here: ");
        loanLength = calculatorScanner.nextInt();
        calculatorScanner.nextLine();

        double simpleInterest = (principle * interestRate * loanLength / 12 / 12);

        System.out.println("Simple Interest: " + simpleInterest);

        calculatorScanner.close();
    }


    }


