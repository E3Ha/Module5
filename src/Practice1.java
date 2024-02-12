
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstName;
        String lastName;

        System.out.println("First Name: ");
        firstName = scan.nextLine();

        System.out.println("Last Name: ");
        lastName = scan.nextLine();

        System.out.println("Your name is: " + firstName + " " + lastName);


    }
}
