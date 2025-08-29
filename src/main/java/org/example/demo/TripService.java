package org.example.demo;

public class TripService {
    // Dependencies via parameters
    public void planTrip(Car car, GPS gps, Logger logger) {
        logger.log("Planning trip with GPS");
        // local var (dependency)
        Engine e = new Engine();
        logger.log("Engine ok: " + (e != null));
    }
}
