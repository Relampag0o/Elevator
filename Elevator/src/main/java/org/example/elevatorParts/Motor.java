package org.example.elevatorParts;

public class Motor {

    private Direction direction;
    private Status status;

    public Motor() {
        this.status = Status.STOPPED;
    }
    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void start(Direction direction) {
        this.direction = direction;
        this.status = Status.RUNNING;
    }

    public void stop() {
        this.status = Status.STOPPED;
    }


    @Override
    public String toString() {
        return "Motor{" +
                "direction=" + direction +
                ", status=" + status +
                '}';
    }
}
