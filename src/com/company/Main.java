package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        1. allow user input of a number (guess)
//        2. tell the user if their guess is too high or too low.
//        3. allow for 5 chances, if the number isn't guessed tell them what it is
//        4. if the number is guessed, congratulate them
//        5. allow the user play again if they would like to

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your guess:");
        int userGuess = input.nextInt();
    }
}