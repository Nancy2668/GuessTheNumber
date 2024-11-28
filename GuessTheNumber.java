// Import required classes
import java.util.Scanner;  // For reading user input
import java.util.Random;   // For generating random numbers

// Main class
public class GuessTheNumber {
    public static void main(String[] args) {
        // Initialize Scanner and Random objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int range = 100;  // Define the range for random numbers
        int score = 0;    // To track the total score
        boolean playAgain = true;

        System.out.println("Welcome to 'Guess the Number'!");

        // Main game loop
        while (playAgain) {
            int numberToGuess = random.nextInt(range) + 1; // Generate a random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 5;  // Limit the number of attempts
            boolean guessedCorrectly = false;

            System.out.println("I have selected a number between 1 and " + range + ". Can you guess it?");

            // Loop for attempts
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();  // Read user's guess
                attempts++;

                // Check the guess
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed it right.");
                    score += (maxAttempts - attempts + 1) * 10; // Points based on remaining attempts
                    guessedCorrectly = true;
                    break;
                } else if (Math.abs(userGuess - numberToGuess) <= 2) {
                    System.out.println("Very close!");
                } else if (Math.abs(userGuess - numberToGuess) <= 5) {
                    System.out.println("Close!");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            // If the user fails to guess the number
            if (!guessedCorrectly) {
                System.out.println("Sorry! You've run out of attempts. The number was " + numberToGuess);
            }

            // Display current score
            System.out.println("Your current score is: " + score);

            // Ask if the player wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing! Your final score is: " + score);
    }
}
