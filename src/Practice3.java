
import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String trash = "";
        double num1 = 0;
        double num2 = 0;
        double product = 0;


        System.out.println("Enter a number.");

        if (scan.hasNextDouble()) {

            num1 = scan.nextDouble();

            System.out.println("Enter a number.");

            if (scan.hasNextDouble()) {

                num2 = scan.nextDouble();

                product = num1 * num2;

                System.out.println("The product of " + num1 + " * " + num2 + " = " + product);

            }
            else{
                trash = scan.nextLine();
                System.out.println("You have not entered a second number.");

            }

        }
        else {
            trash = scan.nextLine();
            System.out.println("You have not entered a number: " + trash);

        }

    }
}
