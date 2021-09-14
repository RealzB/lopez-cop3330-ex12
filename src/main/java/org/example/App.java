package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal:");
        String uiprincipal = sc.nextLine();
        System.out.println("Enter the rate of interest: ");
        String uirate = sc.nextLine();
        System.out.println("Enter the number of years:");
        String uiyears = sc.nextLine();

        float principal = Float.valueOf(uiprincipal);
        float rate = Float.valueOf(uirate);
        float years = Float.valueOf(uiyears);
        float value = principal*(1 +((rate/100)*years));

        String conclusion = String.format("After %.0f years at %.1f percent, the investment will be worth $%.2f.", years, rate, ((value*100)+0.49)/100d);



        System.out.println(conclusion);




    }
}