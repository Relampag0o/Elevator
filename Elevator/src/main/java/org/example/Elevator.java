package org.example;

import org.example.elevatorParts.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// This class represents the elevator itself. It has a few attributes like totalFloors, isMoving, door, dashboard, currentFloor, passengers, maxWeight, and currentWeight.
public class Elevator {
    private int totalFloors;
    private boolean isMoving;
    private Door door;
    private Dashboard dashboard;
    private Floor currentFloor;
    private List<Person> passengers;
    private int maxWeight;
    private int currentWeight;


    public Elevator(int totalFloors) {
        this.totalFloors = totalFloors;
        this.isMoving = false;
        this.door = new Door();
        this.dashboard = new Dashboard();
        this.currentFloor = new Floor(0, 0);
        this.passengers = new ArrayList<Person>();
        this.maxWeight = 500;
        this.currentWeight = 0;
    }

    // this is the main method of our class elevator. The method works for either getting up or down.
    public synchronized void move() throws InterruptedException {
        System.out.println("Elevator is at floor " + currentFloor.getFloorNumber());
        System.out.println("Elevator actual weight: " + calculateTotalWeight() + " kg");
        System.out.println("Elevator actual passengers: " + this.passengers.size());
        System.out.println("Elevator is moving: " + isMoving);
        System.out.println("Elevator door status: " + door.isStatus());

        if (currentFloor.getFloorNumber() < totalFloors && !isMoving && calculateTotalWeight() < maxWeight && this.passengers.size() < 8) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the floor number you`d like to go: ");
            int floorNumber = scanner.nextInt();
            selectButton(floorNumber);
            if (floorNumber != currentFloor.getFloorNumber() && floorNumber <= totalFloors && floorNumber > 0) {
                System.out.println("Elevator is moving to floor " + floorNumber);
                // this part simulates the elevator going up or down..
                // i didnt want to implement two methods but we need different implementations for going up and down.
                if (floorNumber > currentFloor.getFloorNumber())
                    simulateGoingUp(floorNumber);
                else
                    simulateGoingDown(floorNumber);

            } else
                System.out.println("Invalid floor number");
        } else {
            System.out.println("There was an error. Check the max weight capacity, door status, and elevator status");
        }
    }


    public int calculateTotalWeight() {
        int totalWeight = 0;
        for (Person passenger : passengers) {
            totalWeight += passenger.getWeight();
        }
        return totalWeight;
    }

    public void addPassenger(Person person) {
        if (currentWeight + person.getWeight() <= maxWeight) {
            passengers.add(person);
            currentWeight += person.getWeight();
            System.out.println("Passenger added to the elevator");
        } else {
            System.out.println("Elevator is at max weight capacity");
        }
    }

    public void removePassenger(Person person) {
        if (passengers.contains(person)) {
            passengers.remove(person);
            currentWeight -= person.getWeight();
            System.out.println("Passenger removed from the elevator");
        } else {
            System.out.println("Passenger not found in the elevator");
        }
    }


    public ButtonType selectButton(int buttonNumber) {
        ButtonType selectedButtonType = null;
        switch (buttonNumber) {
            case 0:
                selectedButtonType = ButtonType.STOP;
                this.door.close();
                this.isMoving = false;
                break;
            case -1:
                selectedButtonType = ButtonType.OPEN;
                this.door.open();
                break;
            case -2:
                selectedButtonType = ButtonType.CLOSE;
                this.door.close();
                break;
            case -3:
                selectedButtonType = ButtonType.ALARM;
                System.out.println("Alarm is ringing");
                break;

            case 1:
                selectedButtonType = ButtonType.ONE;
                dashboard.pressButton(new Button(ButtonType.ONE));
                this.door.close();
                break;
            case 2:
                selectedButtonType = ButtonType.TWO;
                dashboard.pressButton(new Button(ButtonType.TWO));
                this.door.close();
                break;
            case 3:
                selectedButtonType = ButtonType.THREE;
                dashboard.pressButton(new Button(ButtonType.THREE));
                this.door.close();
                break;

            case 4:
                selectedButtonType = ButtonType.FOUR;
                dashboard.pressButton(new Button(ButtonType.FOUR));
                this.door.close();
                break;
            case 5:
                selectedButtonType = ButtonType.FIVE;
                dashboard.pressButton(new Button(ButtonType.FIVE));
                this.door.close();
                break;

            case 6:
                selectedButtonType = ButtonType.SIX;
                dashboard.pressButton(new Button(ButtonType.SIX));
                this.door.close();
                break;
            case 7:
                selectedButtonType = ButtonType.SEVEN;
                dashboard.pressButton(new Button(ButtonType.SEVEN));
                this.door.close();
                break;

            case 8:
                selectedButtonType = ButtonType.EIGHT;
                dashboard.pressButton(new Button(ButtonType.EIGHT));
                this.door.close();
                break;
            case 9:
                selectedButtonType = ButtonType.NINE;
                dashboard.pressButton(new Button(ButtonType.NINE));
                this.door.close();
                break;

            case 10:
                selectedButtonType = ButtonType.TEN;
                dashboard.pressButton(new Button(ButtonType.TEN));
                this.door.close();
                break;
            default:
                System.out.println("Error..");
                break;
        }
        return selectedButtonType;
    }


    public void simulateGoingUp(int desiredFloor) throws InterruptedException {
        isMoving = true;
        for (int i = 0; i < desiredFloor; i++) {
            System.out.println("Elevator is at floor " + i);
            this.wait(2000); // we suppose that it takes 2 seconds to move to the next floor...
        }
        this.currentFloor.setFloorNumber(desiredFloor);
        this.currentFloor.setMetersFromGround(currentFloor.getMetersFromGround() * 2);

        this.door.open();
        System.out.println("Elevator door is open");
        this.door.close();
        isMoving = false;

    }

    public void simulateGoingDown(int desiredFloor) throws InterruptedException {
        for (int i = currentFloor.getFloorNumber(); i >= desiredFloor; i--) {
            System.out.println("Elevator is at floor " + i);
            this.wait(2000); // we suppose that it takes 2 seconds to move to the previous floor...
        }
        this.currentFloor.setFloorNumber(desiredFloor);
        this.currentFloor.setMetersFromGround(currentFloor.getMetersFromGround() * 2);

        this.door.open();
        System.out.println("Elevator door is open");
        this.door.close();

    }


}
