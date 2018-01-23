package com.company;
import java.util.Scanner;
import java.util.Random;
class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int didTheyGetIt = (0);
        int numOfGuesses = (0);
        // int computerPickedNumber = (66);
        int computerPickedNumber = rand.nextInt(100) + 1;
        System.out.println("Guess what number I am thinking of.");
        while (numOfGuesses < 5) {
            Scanner reader = new Scanner(System.in);
            int guessedNumber = reader.nextInt();
            if (guessedNumber == computerPickedNumber) {
                System.out.println("Congratulations you guessed the right number! If you want to try again click run.");
                numOfGuesses = (numOfGuesses + 1);
                // System.out.println(numOfGuesses);
                didTheyGetIt = (didTheyGetIt + 1);
                break;
            } else {
                System.out.println("Sorry but that's not right.");
                if (guessedNumber < computerPickedNumber) {
                    numOfGuesses = (numOfGuesses + 1);
                    if (numOfGuesses <5) {
                        System.out.println("Your number is too small.");
                        System.out.println("Try again.");
                    }
                } else {
                    numOfGuesses = (numOfGuesses + 1);
                    if (numOfGuesses <5) {
                        System.out.println("Your number is too large.");
                        System.out.println("Try again.");
                    }
                }
            }
        } if (didTheyGetIt == 0) {
            System.out.println("The number I was thinking of was " + computerPickedNumber);
            System.out.println("Sorry you couldn't guess my number, click run to try again!");
        }
    }
}