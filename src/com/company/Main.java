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
        int numberOfGuesses = 0;

        final int MAX_GUESS_COUNT = 4;

        int generatedNumber = (int) Math.ceil(Math.random() * 100);

            System.out.println("Enter your guess:");
            int userGuess = input.nextInt();

            do {
                if (userGuess > generatedNumber) {
                    System.out.println("Your number is too high!");
                    numberOfGuesses++;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Your number is too low!");
                    numberOfGuesses++;
                } else if (userGuess == generatedNumber) {
                    System.out.println("Your number is correct!");
                } else if (numberOfGuesses == MAX_GUESS_COUNT) {
                    System.out.println("Sorry, you have ran out of chances. The correct number was " + generatedNumber);
                }
            } while (numberOfGuesses <= 4);
        }
    }