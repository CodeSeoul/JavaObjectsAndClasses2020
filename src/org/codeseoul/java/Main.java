package org.codeseoul.java;

import org.codeseoul.java.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Car myNewCar = new Car(4);
        myNewCar.drive();

        Car anotherCar = new Car(6);
        anotherCar.drive();

        Car thirdCar = new Car(8);
        int thirdCarWheels = thirdCar.getNumWheels();
        System.out.println("third car wheels: " + thirdCarWheels);

        thirdCar.setNumWheels(4);
        thirdCar.drive();

        Car fourthCar = new Car();
        Car fifthCar = new Car(1, 2);
    }
}
