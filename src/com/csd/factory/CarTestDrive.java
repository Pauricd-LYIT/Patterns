package com.csd.factory;

public class CarTestDrive {

    public static void main(String[] args) {

        CarDealer store = new CarDealer();

        Car car = store.orderCar("FORD");
        System.out.println("We have  a " + car.getName() + " With Max Speed of " + car.maxSpeed);

        car = store.orderCar("TOYOTA");
        System.out.println("We have a " + car.getName() + " With Max Speed of " + car.maxSpeed);
    }
}
