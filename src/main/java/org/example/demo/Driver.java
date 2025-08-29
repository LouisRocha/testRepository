package org.example.demo;

public class Driver {
    // Aggregation: Driver references a Car supplied from outside
    private Car car;

    public Driver(Car car) {
        this.car = car; // aggregation
    }

    // Dependency: parameter TripService; locals created in body
    public void drive(TripService service) {
        service.planTrip(car, new GPS(), new Logger()); // dependencies (GPS, Logger via params/new)
    }
}
