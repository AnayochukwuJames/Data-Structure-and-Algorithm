package org.example;
import java.util.Random;
public class RandomNumber {

        public static void main(String[] args) {
            Random random = new Random();
            int minRange = 1;
            int maxRange = 100;
            int maxAttempts = 10;
            int rounds = 0;
            int score = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("You have " + maxAttempts + " attempts to guess the number between " + minRange + " and " + maxRange);

            boolean playAgain = true;
            while (playAgain) {
                int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                int attempts = 0;
                boolean guessedCorrectly = false;

                while (attempts < maxAttempts) {
                    int userGuess = getUserInput("Enter your guess: ");
                    attempts++;

                    if (userGuess == targetNumber) {
                        System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                        score += attempts;
                        guessedCorrectly = true;
                        break;
                    } else if (userGuess < targetNumber) {
                        System.out.println("Try again. Your guess is too low.");
                    } else {
                        System.out.println("Try again. Your guess is too high.");
                    }
                }

                if (!guessedCorrectly) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
                }

                rounds++;
                System.out.println("Current Score: " + score);
                playAgain = playAgainOption("Do you want to play again? (yes/no): ");
            }

            System.out.println("Game Over! You played " + rounds + " round(s) and your total score is " + score);
        }

        private static int getUserInput(String prompt) {
            String input = System.console().readLine(prompt);
            return Integer.parseInt(input);
        }

        private static boolean playAgainOption(String prompt) {
            String playAgainResponse = System.console().readLine(prompt).toLowerCase();
            return playAgainResponse.equals("yes");
        }
    }

