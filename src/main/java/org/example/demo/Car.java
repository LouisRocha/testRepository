package org.example.demo;

public class Car {
    // Composition: owned parts created here
    private Engine engine = new Engine();
    private GPS gps = new GPS();

    // Aggregation: provided from outside (not constructed here)
    private Wheel wheel;

    public Car(Wheel wheel) {
        this.wheel = wheel; // aggregation
    }

    public void start(Logger logger) {         // dependency on Logger
        logger.log("Car starting");
    }
}
