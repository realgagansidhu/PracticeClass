/* *************************************
Title:      COSC1200 Week 3, In Class Excercise 1
Author:     Gagandeep Kaur
Date:       Jan. 26, 2024
Purpose:    Learning Basic java
 */
import java.util.Scanner;

// The main container class for our various tools that we will build
public class Tools {

    // Generate a random integer within a provided range
    public static int generateRandomInt(int lowerBound, int upperBound) {
        return (int)(Math.random() * (upperBound - lowerBound + 1) + lowerBound);
    }

    // Have the system output a prompt and wait for an integer
    public static int getIntFromConsole(String promptMessage) {

        return getValidIntegerInput(promptMessage);
    }

    public static int getIntFromConsole(String promptMessage, int lowerBound, int upperBound) {

        int userInteger = lowerBound - 1;
        while (userInteger < lowerBound || userInteger > upperBound) {
            userInteger = getValidIntegerInput(promptMessage);

            if (userInteger < lowerBound || userInteger > upperBound) {
                System.out.println("That number is not in range!");
            }
        }

        return userInteger;
    }

    private static int getValidIntegerInput(String promptMessage) {
        Scanner scanner = new Scanner(System.in);
        int userInput = -1;

        do {
            System.out.print(promptMessage + " > ");
            while (!scanner.hasNextInt()) {
                System.out.println("That was not a number!");
                System.out.print(promptMessage + " > ");
                scanner.next();
            }
            userInput = scanner.nextInt();

        } while (userInput <= 0);

        return userInput;

        // Source code partially obtained from polygenelubricants on Jun 17, 2010, from stackoverflow
        // URL: https://stackoverflow.com/questions/3059333/validating-input-using-java-util-scanner
    }
}


