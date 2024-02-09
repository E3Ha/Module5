
import java.util.Scanner;

public class NoteAssignment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double hours = 0;
        String trash;
        double payRate = 0;
        double totalPay = 0;

        System.out.println("How long are your hours?");

        //Conditional

        /*
        try {

            hours = scan.nextDouble();
            System.out.println("Your hours are: " + hours);

        }
        catch (Exception e){

            trash = scan.nextLine();
            System.out.println("You gave an improper input: " + trash);

        }
        */


        if (scan.hasNextInt()) {
            hours = scan.nextInt();
            System.out.println("Your hours are: " + hours);

            if (hours> 40){
                System.out.println("You qualify for overtime.");

            }
            else{
                System.out.println("You do not qualify for overtime.");

            }
            System.out.println("What is your payrate?");

            if(scan.hasNextDouble()){
                payRate = scan.nextDouble();
                totalPay = payRate * hours;
                System.out.println("Your total pay is: " + totalPay);

            }
        }
        else {
            trash = scan.nextLine();
            System.out.println("You gave an improper input: " + trash);


        }




    }

}