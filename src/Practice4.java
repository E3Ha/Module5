
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String trash;
        int num1 = 0;


        System.out.println("Enter an integer.");

        if (scan.hasNextInt()){

            num1 = scan.nextInt();

            if (num1 > 0) {

                System.out.println("Your number is positive.");

            }
            else if (num1 < 0) {

                System.out.println("Your number is negative.");

            }
            else {

                System.out.println("Your number is 0.");

            }
        }
        else {

            trash = scan.nextLine();
            System.out.println("You have not entered an integer: " + trash);

        }

    }
}