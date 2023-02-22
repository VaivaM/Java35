package homeworks;

import java.util.Scanner;

public class HW3 {
/*      Write an application, that will read one number from user (of type int)
        and check, if given number is "near" 100. A number is "near" 100 when
        difference between it and 100 is no bigger than 10.

        Your application should read one number (int) and print false or true on the screen,
        according to instructions above.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your number");
        int number = scanner.nextInt();

        if(number <= 89) {
            System.out.println("FALSE");
        } else if (number >= 111) {
            System.out.println("FALSE");
        }else {
            System.out.println("TRUE");
        }

    }
}
