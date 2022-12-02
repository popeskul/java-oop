package org.example.hw2;

public class Car {
    private void startElectricity() {
        System.out.println("Starting electricity");
    }

    private void startCommand() {
        System.out.println("Starting command");
    }

    private void startFuelSystem() {
        System.out.println("Starting fuel system");
    }

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }
}
