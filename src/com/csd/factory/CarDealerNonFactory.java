package com.csd.factory;

public class CarDealerNonFactory {

    public Car orderCar(String type) {
        Car car = null;
        if (type.equals("TOYOTA")) {
            car = new Toyota();
        } else if (type.equals("FORD")) {
            car = new Ford();
        }
        return car;
    }

    public Car hireCar(String type) {
        Car car = null;
        if (type.equals("TOYOTA")) {
            car = new Toyota();
        } else if (type.equals("FORD")) {
            car = new Ford();
        }
        return car;
    }
}
