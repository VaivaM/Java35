package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float total = 0;

        System.out.println("Enter the size of the array");
        int sizeArray = scanner.nextInt();

        float[] elementArray = new float[sizeArray];
        System.out.println("Enter the elements of the array one by one");
        for (int i =0; i < elementArray.length; i++){
           System.out.println("Please enter element number: " + (i+1));
           elementArray[i] = scanner.nextFloat();
           total += elementArray[i];
        }

        System.out.println("Average grade is: " + (total / elementArray.length));
        System.out.println("There was passed " + (elementArray.length) + " values");
        System.out.println(Arrays.toString(elementArray));
    }
}
