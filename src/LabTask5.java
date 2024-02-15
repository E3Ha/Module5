
import java.util.Scanner;
import java.util.Random;

public class LabTask5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String trash = "";
        int userGuess;
        int randomNum = rand.nextInt(10);

        System.out.println("Guess: ");

        if (scan.hasNextInt()) {

            userGuess = scan.nextInt();

            if (userGuess == randomNum){

                System.out.println("Correct!");
                System.out.println("Your Guess: " + userGuess);
                System.out.println("Computer's Number: " + randomNum);

            }
            else if (userGuess > randomNum){

                System.out.println("Incorrect! Go lower next time.");
                System.out.println("Your Guess: " + userGuess);
                System.out.println("Computer's Number: " + randomNum);

            }
            else {

                System.out.println("Incorrect! Go higher next time.");
                System.out.println("Your Guess: " + userGuess);
                System.out.println("Computer's Number: " + randomNum);

            }

        }
        else {

            trash = scan.nextLine();
            System.out.println("You did not input a correct value: " + trash);

        }


    }
}
