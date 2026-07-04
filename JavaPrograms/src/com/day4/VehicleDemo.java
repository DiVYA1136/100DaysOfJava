package com.day4;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is moving");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.drive();
    }
}