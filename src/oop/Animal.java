package oop;

public class Animal {

    //Fields
    private static String type;
    private static int avgLifespan;
    private static double weight;

    //Constructor
    public Animal(String type, int avgLifespan, double weight) {
        this.type = type;
        this.avgLifespan = avgLifespan;
        this.weight = weight;
    }

    public static void printAnimalInfo() {
        System.out.println("Type: " + type);
        System.out.println("Average lifespan: " + avgLifespan);
        System.out.println("Weight: " + weight);
    }

    public Animal(){
    }

}
