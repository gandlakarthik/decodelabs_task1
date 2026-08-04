import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class NumberGame_Java_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int roundsPlayed = 0;
        boolean playAgain = true;
        System.out.println("=================================");
        System.out.println("  WELCOME TO THE NUMBER GAME");
        System.out.println("  DecodeLabs Java Training - P1");
        System.out.println("=================================");
        while (playAgain) {
            roundsPlayed++;
            int score = playRound(sc, random, roundsPlayed);
            totalScore += score;
            System.out.print("\nPlay Again? [Y/N]: ");
            String choice = sc.nextLine().trim();
            playAgain = choice.equalsIgnoreCase("Y");
        }
        System.out.println("\n=================================");
        System.out.println("  GAME OVER");
        System.out.println("  Rounds Played : " + roundsPlayed);
        System.out.println("  Final Score   : " + totalScore);
        System.out.println("=================================");

        sc.close();
    }

    private static int playRound(Scanner sc, Random random, int roundNumber) {
        int target = random.nextInt(100) + 1;
        int maxAttempts = 7;
        int attemptsUsed = 0;
        boolean won = false;
        System.out.println("\n--- Round " + roundNumber + " ---");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts. Good luck!");
        while (attemptsUsed < maxAttempts && !won) {
            int guess = getValidGuess(sc, attemptsUsed + 1);
            attemptsUsed++;
            if (guess == target) {
                won = true;
                System.out.println("Correct! The number was " + target + ".");
            } else if (guess > target) {
                System.out.println("Too High! Attempts remaining: " + (maxAttempts - attemptsUsed));
            } else {
                System.out.println("Too Low! Attempts remaining: " + (maxAttempts - attemptsUsed));
            }
        }
        if (!won) {
            System.out.println("Out of attempts! The number was " + target + ".");
            return 0;
        }
        int roundScore = (maxAttempts - attemptsUsed + 1) * 10;
        System.out.println("You scored " + roundScore + " points this round.");
        return roundScore;
    }

    private static int getValidGuess(Scanner sc, int attemptNumber) {
        int guess = -1;
        boolean valid = false;

        while (!valid) {
            System.out.print("Attempt " + attemptNumber + " - Enter your guess (1-100): ");
            try {
                guess = sc.nextInt();
                sc.nextLine(); // flush the buffer - the "Scanner Trap" fix

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number within 1 and 100.");
                    continue;
                }
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a whole number.");
                sc.nextLine(); // clear the bad token from the buffer
            }
        }
        return guess;
    }
}
