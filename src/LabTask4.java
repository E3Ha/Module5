
import java.util.Scanner;

public class LabTask4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String trash;
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;

        System.out.println("Meters: ");

        if (scan.hasNextDouble()) {

            meters = scan.nextDouble();

            miles = meters / 1609.34;
            feet = meters * 3.28084;
            inches = meters * 39.3701;

            System.out.println("Miles: " + miles);
            System.out.println("Feet: " + feet);
            System.out.println("Inches: " + inches);

        }
        else {

            trash = scan.nextLine();
            System.out.println("You did not input a correct value: " + trash);

        }



    }
}

