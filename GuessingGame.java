import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int ComputerGuess = random.nextInt(100) + 1;
        int attempts = 10;
        System.out.println();
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println();
        System.out.println("Try to guess the number between 1 and 100");
        System.out.println();

        while (attempts > 0) {
            System.out.println("Now");
            System.out.println();
            System.out.print("Enter your guess number: ");
            int UserGuess = scanner.nextInt();

            if (UserGuess == ComputerGuess) {
                System.out.println("Congratulations! You guessed number or");
                break;
            } else if (UserGuess < ComputerGuess) {
                System.out.println("Try a higher number, Remaining Attempts : " + --attempts);
            } else {
                System.out.println("Try a lower number, Remaining Attempts : " + --attempts);
            }
        }

        System.out.println("The correct number was: " + ComputerGuess);
        scanner.close();
    }  