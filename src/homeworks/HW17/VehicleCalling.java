package homeworks.HW17;

import java.util.Scanner;

public class VehicleCalling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fuel amount in your vehicle: ");
        float fuel = scanner.nextFloat();

        System.out.println("Enter your vehicle's fuel usage per 100km: ");
        float fuelUsage = scanner.nextFloat();

        System.out.println("Enter number of passengers: ");
        int passengers = scanner.nextInt();

        Vehicle vehicle = new Vehicle(fuel, fuelUsage, passengers);

        float maxDistance = vehicle.maxDistance();
        System.out.println("Your vehicle can drive maximum of: " + String.format("%.2f", vehicle.maxDistance()) + "kilometers");
    }
}
