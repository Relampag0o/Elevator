package org.example;

import org.example.elevatorParts.Dashboard;
import org.example.elevatorParts.Door;
import org.example.elevatorParts.Floor;

import java.util.ArrayList;
import java.util.List;


public class Elevator {
    private int totalFloors;
    private boolean isMoving;
    private Door door;
    private Dashboard dashboard;
    private Floor currentFloor;
    private List<Person> passengers;
    private int maxPassengers;
    private int maxWeight;
    private int currentWeight;


    public Elevator(int totalFloors, int maxPassengers, int maxWeight) {
        this.totalFloors = totalFloors;
        this.isMoving = false;
        this.door = new Door();
        this.dashboard = new Dashboard();
        this.currentFloor = new Floor(0, 0);
        this.passengers = new ArrayList<Person>();
        this.maxPassengers = maxPassengers;
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }



}
