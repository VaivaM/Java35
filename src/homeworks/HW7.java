package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        /*        Enter arrays size and add elements. Sum all elements in the array.*/

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter the size of the array");
        int sizeArray = scanner.nextInt();
        int elementArray[] = new int [sizeArray];

        System.out.println("Enter the elements of the array one by one");

        for (int i =0; i < elementArray.length; i++){
            System.out.println("Please enter element number:" + (i+1));
            elementArray[i] = scanner.nextInt();
            sum += elementArray[i];
        }
        System.out.println(Arrays.toString(elementArray));
        System.out.println("Sum " + sum);

    }
}
