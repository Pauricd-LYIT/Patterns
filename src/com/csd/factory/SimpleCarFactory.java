package com.csd.factory;

public class SimpleCarFactory {

    public static Car createCar(String type) {

        Car car = null;

        if (type.equals("TOYOTA")) {
            car = new Toyota();
        } else if (type.equals("FORD")) {
            car = new Ford();
        }
        return car;
    }
}
