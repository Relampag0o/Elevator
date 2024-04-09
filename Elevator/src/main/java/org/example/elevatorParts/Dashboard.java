package org.example.elevatorParts;

import java.util.ArrayList;
import java.util.List;

public class Dashboard {

    private List<Button>buttons;

    public Dashboard() {
        this.buttons = new ArrayList<Button>();
    }


    public void addButton(Button button) {
        buttons.add(button);
    }

    public void removeButton(Button button) {
        buttons.remove(button);
    }

    public void pressButton(Button button) {
        System.out.println("Button pressed: " + button.getType());
    }



}
