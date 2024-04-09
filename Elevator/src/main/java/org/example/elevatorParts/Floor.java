package org.example.elevatorParts;

public class Floor {

    private int floorNumber;
    private int metersFromGround;


    public Floor(int floorNumber, int metersFromGround) {
        this.floorNumber = floorNumber;
        this.metersFromGround = metersFromGround;
    }


    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getMetersFromGround() {
        return metersFromGround;
    }

    public void setMetersFromGround(int metersFromGround) {
        this.metersFromGround = metersFromGround;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "floorNumber=" + floorNumber +
                ", metersFromGround=" + metersFromGround +
                '}';
    }
}
