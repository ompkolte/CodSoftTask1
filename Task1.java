import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Guess the Number");
        System.out.println("You have to guess the correct number between 1 to 100. You have 3 chances.");

        int ans = rand.nextInt(100) + 1;
        int input = 0;
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("Enter the number you have guessed:");
            input = sc.nextInt();

            if (input == ans) {
                System.out.println("Congrats, you have guessed the correct number!");
                break;
            } else if (input < ans) {
                System.out.println("You guessed it low. Please try again!");
            } else {
                System.out.println("You guessed it high. Please try again!");
            }

            attempts--;

            if (attempts > 0) {
                System.out.println("You have " + attempts + " attempts left.");
            } else {
                System.out.println("Sorry, you have used all your attempts. The correct number was " + ans + ".");
            }
        }

        sc.close();
    }
}
