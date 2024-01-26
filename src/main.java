/* *************************************
Title:      COSC1200 Week 3, In Class Excercise 1
Author:     Gagandeep Kaur
Date:       Jan. 26, 2024
Purpose:    Learning Basic java
 */
import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        initializeGame();
        playGame();
    }

    //<editor-fold desc="Global Variable Declarations">
    static final int MIN_RANGE = 1, MAX_RANGE = 100;
    static int targetNumber = 0;
    //</editor-fold>

    //<editor-fold desc="Tools">
    private static int generateRandomInt(int lowerBound, int upperBound) {
        return (int)(Math.random() * upperBound + lowerBound);
    }
    //</editor-fold>

    //<editor-fold desc="Game Logic">
    private static void initializeGame() {
        targetNumber = generateRandomInt(MIN_RANGE, MAX_RANGE);
    }

    private static void playGame() {
        int userGuess, numberOfGuesses = 0;
        do {
            numberOfGuesses++;
            userGuess = getUserGuess();
            if (userGuess > targetNumber) {
                System.out.println("Sorry, your guess was too HIGH!");
            } else if (userGuess < targetNumber) {
                System.out.println("Sorry, your guess was too LOW!");
            }
        } while (userGuess != targetNumber);

        System.out.println("CONGRATS, you guessed the correct number: " + targetNumber + " in " + numberOfGuesses + " guesses!");
    }

    private static int getUserGuess() {
        System.out.println("Please enter your guess (" + MIN_RANGE + " - " + MAX_RANGE + "): ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    //</editor-fold>
}


