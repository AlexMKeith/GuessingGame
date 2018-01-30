package com.company;
import java.util.Scanner;
import java.util.Random;
class Main {
    public static void main(String[] args) {
        int wantToPlay = (0);
        while (wantToPlay == 0) {
            Random rand = new Random();
            int didTheyGetIt = (0);
            int numOfGuesses = (0);
            int computerPickedNumber = rand.nextInt(100) + 1;
            System.out.println("Hello, what is your name?");
            Scanner userName = new Scanner(System.in);
            String name = userName.next();
            if (name.equals("Elijah")) {
                System.out.println("That's a stupid name for a stupid person!");
            } else {
                System.out.println(name + ", that's a good name.");
            }
            System.out.println("Guess what number I am thinking of.");
            while (numOfGuesses < 5) {
                Scanner reader = new Scanner(System.in);
                try {
                    int guessedNumber = reader.nextInt();
                    if (name.equals("Alex") || name.equals("alex")) {
                        computerPickedNumber = guessedNumber;
                    }
                    if (guessedNumber == computerPickedNumber) {
                        System.out.println("Congratulations you guessed the right number!");
                        numOfGuesses = (numOfGuesses + 1);
                        didTheyGetIt = (didTheyGetIt + 1);
                        break;
                    } else {
                        System.out.println("Sorry but that's not right.");
                        if (guessedNumber < computerPickedNumber) {
                            numOfGuesses = (numOfGuesses + 1);
                            if (numOfGuesses < 5) {
                                System.out.println("Your number is too small.");
                                System.out.println("Try again.");
                            }
                        } else {
                            numOfGuesses = (numOfGuesses + 1);
                            if (numOfGuesses < 5) {
                                System.out.println("Your number is too large.");
                                System.out.println("Try again.");
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println("What kind of an answer is that?");
                }

            }
            if (didTheyGetIt == 0) {
                System.out.println("The number I was thinking of was " + computerPickedNumber);
                System.out.println("Sorry you couldn't guess my number, maybe try again.");
            }
            System.out.println("If you want to play again type '0', if not type '1'.");
            Scanner play = new Scanner(System.in);
            wantToPlay = play.nextInt();
        }
    }
}