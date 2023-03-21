package homeworks;

public class HW13 {
    public static void main(String[] args) {

        //Min & max methods
        int[] arrayNumbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        maxArray(arrayNumbers);
        minArray(arrayNumbers);

    }
    public static int maxArray ( int [] arrayNumbers) {
        int maxNumber = arrayNumbers[0];

        for (int i = 0; i < arrayNumbers.length; i++){
            if(arrayNumbers[i] > maxNumber){
                maxNumber = arrayNumbers[i];
            }
        }
        System.out.println("Max number is " + maxNumber);
        return maxNumber;
    }

    public static int minArray (int [] arrayNumbers) {
        int minNumber = arrayNumbers[0];
        System.out.println("Min number is " + minNumber);
        return minNumber;
    }
}
