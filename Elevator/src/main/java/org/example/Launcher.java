package org.example;

public class Launcher {
    public static void main(String[] args) throws InterruptedException {
        Elevator elevator = new Elevator(10);

        elevator.goToFloor(5);
        elevator.goToFloor(2);
    }
}