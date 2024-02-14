
import java.util.Scanner;

public class LabTask1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double tempC = 0;
        double tempF = 0;
        String trash;

        System.out.println("Input temperature in Celsius: ");

        if (scan.hasNextDouble()) {

            tempC = scan.nextDouble();
            tempF = tempC * (9/5) + 32;
            System.out.println(tempC + " in degrees fahrenheit is " + tempF);

        }
        else {

            trash = scan.nextLine();
            System.out.println("You did not input a correct value: " + trash);

        }



    }
}
