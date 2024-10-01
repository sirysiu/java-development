package com.pluralsight.calculator;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MortgageCalculator objA = new MortgageCalculator();
        SecondCalculator objB = new SecondCalculator();
        ThirdCalculator objC = new ThirdCalculator();


        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to do (1) Mortgage Calculator, " +
                "2) CD Calculator, 3) Annuity Calculator ) ? ");
        int command = scanner.nextInt();
        if (command == 1) {
            objA.input();
        } else if (command == 2) {
            objB.secondInput();
        }      else {

            objC.thirdInput();
        }
                     
    }

    }


