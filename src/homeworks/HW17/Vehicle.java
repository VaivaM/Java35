package homeworks.HW17;

public class Vehicle {

    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

    public Vehicle(float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public float maxDistance(float fuel, float fuelUsage, int passengers) {
        float totalFuelUsage = fuelUsage * (1 + (0.05f * passengers));
        return fuel / (totalFuelUsage / 100);
    }

    public float maxDistance() {

        return maxDistance(this.fuel, this.fuelUsage, this.passengers);
    }
}


