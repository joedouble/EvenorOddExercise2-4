package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Exercise 2.4

        double userNumber = 0;
        double userChoice = 0;

        boolean userContinue = false;

        Scanner myScanner = new Scanner(System.in);
        
        do {
            System.out.println("Please enter a number. ");
            userNumber = myScanner.nextInt();

            if (userNumber % 2 == 0) {
                System.out.println("The number you entered is even.");
            } else {
                System.out.println("The number you entered is odd.");
            }
            System.out.println("\nWould you like to enter another number?  Please enter 1 for YES and 2 for NO.");
            userChoice = myScanner.nextInt();

            if (userChoice == 1) {
                userContinue = true;
            } else {
                userContinue = false;
            }

        } while (userContinue);
    }
}

