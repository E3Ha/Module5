
import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String trash;
        double waterTemp = 0;


        System.out.println("Decimal value for water temp in F: ");

        if (scan.hasNextDouble()) {

            waterTemp = scan.nextDouble();

            if (waterTemp >= 212) {

                System.out.println("Water at this temperature: " + waterTemp + " is a Gas.");

            }
            else if (waterTemp <= 32) {

                System.out.println("Water at this temperature: " + waterTemp + " is a Solid.");

            }
            else {

                System.out.println("Water at this temperature: " + waterTemp + " is a Liquid.");

            }
        }
        else {

            trash = scan.nextLine();
            System.out.println("You have not entered a decimal value: " + trash);

        }
    }
}