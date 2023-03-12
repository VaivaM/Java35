package tasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a year");

        int yearInput = scanner.nextInt();

        if (yearInput < 0){
            System.out.println("Invalid input");
        } else if (yearInput > 2100) {
            System.out.println("You are looking too far in the future, live for today");
        } else if ((yearInput % 400 == 0) || ((yearInput % 4 == 0) && (yearInput % 100 != 0))){
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }

    }
}
