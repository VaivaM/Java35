package homeworks;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HW11 {
    public static void main(String[] args) {
        //Personal code

        Scanner scanner = new Scanner(System.in);

        char again = 'y';

        while (again == 'y') {
            System.out.println("Enter your personal number:");
            String personalNumber = scanner.next();

            if (Pattern.matches("[0-9]{6}-[0-9]{5}", personalNumber)) {
                System.out.println("Your inputted personal number is valid");
            } else {
                System.out.println("Your inputted personal number is invalid");
            }

        System.out.println("Do you want to run again? y/n");
        again = scanner.next().charAt(0);
                //Fixing problem
        scanner.nextLine();

        }
    }
}
