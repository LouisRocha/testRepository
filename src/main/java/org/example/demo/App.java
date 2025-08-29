package org.example.demo;

public class App {
    public static void main(String[] args) {
        Wheel wheel = new Wheel();
        Car car = new Car(wheel);              // aggregation (Wheel injected)
        Driver driver = new Driver(car);       // aggregation (Car injected)
        TripService service = new TripService();

        driver.drive(service);                 // dependency to TripService
        new ServiceCenter().repair(car);       // dependency to Car (+ returns Engine)
    }
}
