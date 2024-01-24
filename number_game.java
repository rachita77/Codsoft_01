import java.util.Scanner;
import java.util.Random;

public class number_game 
{
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        Random number = new Random();
        int numbertoguess = number.nextInt(100) + 1;
        int numberoftries = 0;
        boolean hasguessedcorrectly = false;

        System.out.println("Welcome to Guess the Number game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while(!hasguessedcorrectly)
        {
            System.out.println("Enter your guess: ");
            int guess = game.nextInt();
            numberoftries++;

            if(guess < numbertoguess)
            {
                System.out.println("Too low! Try again.");
            }
            else if(guess > numbertoguess)
            {
                System.out.println("Too high! Try again.");
            }
            else
            {
                System.out.println("Congratulations! You've guessedthe number in " + numberoftries + " tries.");
                hasguessedcorrectly = true;
            }
        }
        game.close();
    }
}
