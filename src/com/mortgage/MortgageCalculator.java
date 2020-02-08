package com.mortgage;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        int principal = principal();
        float annualInterest = annualInterest();
        byte years = years();

        String mortgageFormatted = calculateMortgage(principal, annualInterest, years);
        System.out.println("Mortgage:" + mortgageFormatted);
    }

    public static int principal (){
        int principal;
        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                return principal;
            System.out.println("Enter a value between 1,000 and 1,000,000.");
        }
    }

    private static float annualInterest() {
        float annualInterest;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest > 0 && annualInterest <= 30)
                return annualInterest;
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }
    }

    private static byte years() {
        byte years;
        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30)
                return years;
            System.out.println("Enter a value between 1 and 30.");
        }
    }

    public static String calculateMortgage (int principal, float annualInterest, byte years) {
        final byte months_in_year = 12;
        final byte percent = 100;
        float monthlyInterest = annualInterest/percent/months_in_year;
        int numberOfPayments = years * months_in_year;
        double mortgage = principal * ((monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
        return NumberFormat.getCurrencyInstance().format(mortgage);
    }
}
