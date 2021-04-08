import java.util.Scanner;

public class LittleQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        System.out.println("1. What is the capital of Alaska?");
        System.out.println("1) Melbourne");
        System.out.println("2) Anchorage");
        System.out.println("3) Juneau");
        int first = input.nextInt();
        if (first == 3) {
            System.out.println("That's right!");
            score++;
        }
        else {
            System.out.println("Not correct");
        }
        System.out.println("2. Can you store the value \"cat\" in a variable of type int?");
        System.out.println("1) Yes");
        System.out.println("2) No");
        int second = input.nextInt();
        if (second == 2) {
            System.out.println("That's correct!");
            score++;
        }
        else {
            System.out.println("Not correct");
        }
        System.out.println("1. What is the result of 9+6/3?");
        System.out.println("1) 5");
        System.out.println("2) 11");
        System.out.println("3) 15/3");
        int third = input.nextInt();
        if (third == 2) {
            System.out.println("That's right!");
            score++;
        }
        else {
            System.out.println("Not correct");
        }

        System.out.println("You got " + score + " out of 3 correct");
        System.out.println("Thanks for playing!");
    }
}