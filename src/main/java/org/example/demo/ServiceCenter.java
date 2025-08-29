package org.example.demo;

public class ServiceCenter {
    // Composition: owns its Logger instance
    private Logger logger = new Logger();

    // Dependency: takes Car; return type Engine is also a dependency
    public Engine repair(Car car) {
        logger.log("Repairing car");
        Engine newEngine = new Engine(); // dependency via local/new
        return newEngine;
    }
}
