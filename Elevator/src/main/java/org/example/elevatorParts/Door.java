package org.example.elevatorParts;

public class Door {
    private boolean status;



    public Door() {
        this.status = false;
    }

    public void open() {
        if (status) {
            System.out.println("Door is already open");
        } else {
            status = true;
            System.out.println("Door is opening");
        }
    }

    public void close() {
        if (!status) {
            System.out.println("Door is already closed");
        } else {
            status = false;
            System.out.println("Door is closing");
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
