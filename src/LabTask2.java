import java.util.Scanner;

public class LabTask2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double gallonsInTank = 0;
        double fuelEffic = 0;
        double gasPrice = 0;
        double cost = 0;
        double distance = 0;
        String trash;

        System.out.println("Input # of gallons of gas in tank: ");

        if (scan.hasNextDouble()) {

            gallonsInTank = scan.nextDouble();
            System.out.println("Input fuel efficiency in miles per gallon: ");

            if (scan.hasNextDouble()) {

                fuelEffic = scan.nextDouble();
                System.out.println("Input price of gas per gallon: ");

                if (scan.hasNextDouble()) {

                    gasPrice = scan.nextDouble();
                    cost = (100 / fuelEffic) * gasPrice;
                    System.out.println("The total cost to drive 100 miles is: " + cost);
                    //distance =
                    System.out.println("The total distance you can travel currently is: " + distance);

                }
                else{
                    System.out.println("You did not input a correct value.");
                }
            }
            else{
                System.out.println("You did not input a correct value.");
            }
        }
        else {

            trash = scan.nextLine();
            System.out.println("You did not input a correct value: " + trash);

        }


    }
}
