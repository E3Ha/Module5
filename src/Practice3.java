
import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String trash;
        double num1 = 0;
        double num2 = 0;
        double sum = 0;


        System.out.println("Enter a number.");

        if (scan.hasNextDouble()) {

            num1 = scan.nextDouble();

            System.out.println("Enter a number.");

            if (scan.hasNextDouble()) {

                num2 = scan.nextDouble();

                sum = num1 * num2;

                System.out.println("The sum of " + num1 + " * " + num2 + " = " + sum);

            }

        }
        else {

            trash = scan.nextLine();

        }

    }
}
