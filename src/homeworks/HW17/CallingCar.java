package homeworks.HW17;

import java.util.Scanner;

public class CallingCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fuel amount in your vehicle: ");
        float fuel = scanner.nextFloat();

        System.out.println("Enter your vehicle's fuel usage per 100km: ");
        float fuelUsage = scanner.nextFloat();

        System.out.println("Enter how many passengers will be in vehicle: ");
        int passengers = scanner.nextInt();

        System.out.println("Will you turn on an air conditioner (y/n): ");
        String input = scanner.next();
        boolean airConditioner = input.equalsIgnoreCase("y");

        Car car = new Car(fuel, fuelUsage, passengers, airConditioner);
        System.out.println("Maximum distance: " + String.format("%.2f", car.maxDistance()) + "km");

    }
}
