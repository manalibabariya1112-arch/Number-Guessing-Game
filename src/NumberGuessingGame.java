import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Initialize components
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int userGuess = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");

        // Loop until the user guesses correctly
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");

            // Validate input type
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                numberOfTries++;

                // Check the user's guess against the generated number
                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    hasGuessedCorrectly = true;
                    System.out.println("\nCongratulations! You've guessed the correct number.");
                    System.out.println("It took you " + numberOfTries + " tries.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid token
            }
        }

        scanner.close();
    }
}
