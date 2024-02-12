
import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String trash;
        int intUserInput = 0;
        double doubleUserInput = 0;


        System.out.println("Input a double or an integer.");

        if (scan.hasNextInt()) {

            intUserInput = scan.nextInt();
            System.out.println("You entered an Integer: " + intUserInput);

        }
        else if (scan.hasNextDouble()) {

            doubleUserInput = scan.nextDouble();
            System.out.println("You entered a Double: " + doubleUserInput);

        }
        else {

            trash = scan.nextLine();
            System.out.println("You have incorrectly entered a String: " + trash);

        }

    }
}
