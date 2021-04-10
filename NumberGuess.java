import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Random x = new Random();
        // That'll pick a random number from 1 to 10 (inclusive)
        int r = 1 + x.nextInt(10);
        System.out.println("I am thinking about a number from 1 to 10.");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Your guess: " + n);

        if (n == r) {
            System.out.println("That's right!  My secret number was " + r);

        }
           else {
             System.out.println("Sorry, but I was really thinking of " + r);
           }
}
}
