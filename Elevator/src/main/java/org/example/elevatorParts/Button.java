package org.example.elevatorParts;

public class Button {

    private ButtonType type;

    public Button(ButtonType type) {
        this.type = type;
    }


    public ButtonType getType() {
        return type;
    }

    public void setType(ButtonType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Button{" +
                "type=" + type +
                '}';
    }
}
