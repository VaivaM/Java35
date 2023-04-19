package homeworks.HW17;

public class Car extends Vehicle {

    private boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }

    public float maxDistance() {
        float totalFuelUsage = fuelUsage * (1 + passengers * 0.05f);
        if (airConditioner){
            totalFuelUsage *= 1.1f;
        }
        return (fuel / totalFuelUsage) * 100.0f;
    }
}
