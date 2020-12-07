package org.codeseoul.java.vehicles;

public class Car {
    private int numWheels;

    public Car(int countWheels) {
        this.numWheels = countWheels;
    }

    public Car(float otherWheels) {
        this.numWheels = (int) otherWheels;
    }

    public Car(int countWheels, int someOtherNumber) {
        this.numWheels = countWheels;
    }

    public Car() {
        this.numWheels = 4;
    }

    public int getNumWheels() {
        System.out.println("get num wheels was called");
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        if (numWheels % 2 == 1) {
            throw new RuntimeException("Can't use an odd number of wheels");
        }
        this.numWheels = numWheels;
    }

    public void drive() {
        System.out.println("I'm driving on " + this.numWheels + " wheels!");
    }
}
