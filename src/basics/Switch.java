package basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter grade");

        int grade = scanner.nextInt();

        switch (grade){
            case 1:
                System.out.println("Very very bad");
                break;
            case 2:
                System.out.println("Very bad");
            case 3:
                System.out.println("Bad");
            case 4:
                System.out.println("Normal");
                break;
            default:
                System.out.println("Grade not accepted");
        }
    }
}
