package com.csd.factory;

public class CarDealer {

    public CarDealer() { }

    public Car orderCar(String type) {
        Car car;
        car = SimpleCarFactory.createCar(type);
        return car;
    }

    public Car hireCar(String type) {
        Car car;
        car = SimpleCarFactory.createCar(type);
        return car;
    }
}
