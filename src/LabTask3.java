
import java.util.Scanner;

public class LabTask3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String trash;
        double length = 0;
        double height = 0;
        double area = 0;
        double diagonal = 0;

        System.out.println("Length: ");

        if (scan.hasNextDouble()) {

            length = scan.nextDouble();

            System.out.println("Height: ");

            if (scan.hasNextDouble()) {

                height = scan.nextDouble();

                area = length * height;
                diagonal = Math.sqrt(Math.pow(length,2) + Math.pow(height,2));

                System.out.println("Area of Rectangle: " + area);
                System.out.println("Length of Diagonal: " + diagonal);

            }
            else {
                trash = scan.nextLine();
                System.out.println("You did not input a correct value: " + trash);
            }

        }
        else {
            trash = scan.nextLine();
            System.out.println("You did not input a correct value: " + trash);
        }



    }
}
