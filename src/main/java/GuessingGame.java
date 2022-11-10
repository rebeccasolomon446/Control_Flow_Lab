import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        //prompt the user to pick any number between 1 and 20.
        Scanner reader = new Scanner(System.in);
        System.out.println("Guess the secret number to win a prize!");

        //.nextInt() allows the input by user to be an Integer.
        int secretNumber = reader.nextInt();
        System.out.println("Chosen secret number: " + secretNumber);

        if(secretNumber == 7) {
            System.out.println("You have chosen the right number, here is your prize!!");
        } else if(secretNumber > 20) {
            System.out.println("Your number was out of range, please choose below 20.");
        } else {
            System.out.println("You have chosen the wrong number, no prize for you.");
        }

    }
}
       // would like to know how to allow the user to pick again if they have chosen a number above 20.
