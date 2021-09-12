/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;
import java.lang.Math;


public class Interestcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the principal:");
        String principalString = input.nextLine();

        double principal = Double.parseDouble(principalString);

        System.out.print("Enter the rate of interest:");
        String rateString = input.nextLine();

        double rate = Double.parseDouble(rateString);

        System.out.print("Enter the number of years:");
        String yearsString = input.nextLine();

        double years = Double.parseDouble(yearsString);

        double total = Math.ceil((principal * (1 + rate/100 * years)) * 100)/100;

        System.out.printf("After %.2f years at %.2f percent, the investment will be worth $%.2f", years, rate, total);



    }
}
