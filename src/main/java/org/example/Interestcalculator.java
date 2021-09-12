/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;


public class Interestcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the principal:");
        String principalString = input.nextLine();

        float principal = Float.parseFloat(principalString);

        System.out.print("Enter the rate of interest:");
        String rateString = input.nextLine();

        float rate = Float.parseFloat(rateString);

        System.out.print("Enter the number of years:");
        String yearsString = input.nextLine();

        float years = Float.parseFloat(yearsString);

        float total = principal * (1 + rate/100 * years);

        System.out.printf("After %.2f years at %.2f percent, the investment will be worth $%.2f", years, rate, total);



    }
}
