package oop;

public class CallingAnimalClass {
    public static void main(String[] args) {

        //Creating new Animal class object
        Animal dog = new Animal("Poodle",15, 4.6d);
        dog.printAnimalInfo();

        Animal cat = new Animal("Persian", 18,5.7d);
        cat.printAnimalInfo();

        Animal dog2 = new Animal();
    }
}
