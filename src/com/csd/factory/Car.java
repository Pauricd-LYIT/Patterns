package com.csd.factory;

public abstract class Car {

    String name;
    String maxSpeed;


    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Max Speed= "+this.getName()+", Number of Doors="+this.maxSpeed;
    }
}
