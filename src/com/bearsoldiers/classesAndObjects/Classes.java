package com.bearsoldiers.classesAndObjects;

public class Classes {
    // classes and objects

    public static void main(String[] args) {
        Vehicle car = new Vehicle("BMW", 5, true);
        Vehicle bike = new Vehicle("TVS", 2, true);
        System.out.println(car);
        System.out.println(bike);

        // Printing objects blueprint
        System.out.println(car.name);
        System.out.println(car.numberOfWheels);
        System.out.println(car.bs6);
        System.out.println(bike.name);
        System.out.println(bike.numberOfWheels);
        System.out.println(bike.bs6);

    }

    static class Vehicle{
        String name;
        int numberOfWheels;
        boolean bs6;
        // Constructor
        Vehicle(String name, int numberOfWheels, boolean bs6){
            this.name = name;
            this.numberOfWheels = numberOfWheels;
            this.bs6 = bs6;
        }
    }
}
