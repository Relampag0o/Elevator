package org.example;


public class Elevator {
    private int currentFloor;
    private int totalFloors;

    public Elevator(int totalFloors) {
        this.totalFloors = totalFloors;
        this.currentFloor = 1; // assuming the elevator starts at the first floor
    }

    public void moveUp() throws InterruptedException {
        if (currentFloor < totalFloors) {
            currentFloor++;
            System.out.println("Elevator moving up to floor " + currentFloor);
            Thread.sleep(2000); // wait for 2 seconds
        } else {
            System.out.println("Elevator is already at the top floor");
        }
    }

    public void moveDown() throws InterruptedException {
        if (currentFloor > 1) {
            currentFloor--;
            System.out.println("Elevator moving down to floor " + currentFloor);
            Thread.sleep(2000); // wait for 2 seconds
        } else {
            System.out.println("Elevator is already at the ground floor");
        }
    }

    public void goToFloor(int floor) throws InterruptedException {
        if (floor > totalFloors || floor < 1) {
            System.out.println("Invalid floor number");
        } else {
            while (currentFloor < floor) {
                moveUp();
            }
            while (currentFloor > floor) {
                moveDown();
            }
        }

        System.out.println("Elevator has arrived at floor " + currentFloor);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }


    @Override
    public String toString() {
        return "Elevator{" +
                "currentFloor=" + currentFloor +
                ", totalFloors=" + totalFloors +
                '}';
    }
}
