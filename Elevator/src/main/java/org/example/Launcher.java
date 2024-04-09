package org.example;

public class Launcher {
    public static void main(String[] args) throws InterruptedException {
        // CREATING ELEVATOR:
        Elevator elevator = new Elevator(10);

        // EXAMPLE DATA:
        elevator.addPassenger(new Person("John", 80, 100, 180));
        elevator.addPassenger(new Person("Alice", 60, 80, 140));
        elevator.addPassenger(new Person("Bob", 70, 90, 160));
        elevator.addPassenger(new Person("Charlie", 40, 110, 200));
        elevator.addPassenger(new Person("David", 30, 110, 220));

        // MOVING AND GETTING DOWN:
        elevator.move();
        elevator.move();

    }
}