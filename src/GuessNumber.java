import java.util.Scanner;
import java.util.Random;


public class GuessNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(10) + 1;
        int usersGuess = -1;
        int numberOfTries = 0;

        while (usersGuess != numberToGuess) {

            System.out.println("Input a number between 1 and 10");
            usersGuess = input.nextInt();
            numberOfTries++;

            if (usersGuess > numberToGuess) {
                System.out.println("Incorrect, the number I'm thinking of is smaller. Try again.");
            } else if (usersGuess < numberToGuess) {
                System.out.println("Incorrect, the number I'm thinking of is larger. Try again.");
            } else {
                System.out.println("Correct! The number I was think of was " + numberToGuess);
            }
        }
        System.out.println("Number of tries: " + numberOfTries);
    }
}

