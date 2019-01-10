package com.workp.amal.garage;

public class Bike extends Vehicle {

    public Bike(String modelName, String description, String manufacturer, int year, String color, int speed, int[] dimensions, int weight) {
        super(modelName, description, manufacturer, year, color, speed, dimensions, weight);
    }

    public Bike() {
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
