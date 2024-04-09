package org.example.elevatorParts;

import java.util.ArrayList;
import java.util.List;

public class Dashboard {

    private List<Button> buttons;

    public Dashboard() {

        this.buttons = new ArrayList<Button>();
        buttons.add(new Button(ButtonType.STOP));
        buttons.add(new Button(ButtonType.OPEN));
        buttons.add(new Button(ButtonType.CLOSE));
        buttons.add(new Button(ButtonType.ALARM));
        buttons.add(new Button(ButtonType.ONE));
        buttons.add(new Button(ButtonType.TWO));
        buttons.add(new Button(ButtonType.THREE));
        buttons.add(new Button(ButtonType.FOUR));
        buttons.add(new Button(ButtonType.FIVE));
        buttons.add(new Button(ButtonType.SIX));
        buttons.add(new Button(ButtonType.SEVEN));
        buttons.add(new Button(ButtonType.EIGHT));
        buttons.add(new Button(ButtonType.NINE));
        buttons.add(new Button(ButtonType.TEN));
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

    @Override
    public String toString() {
        return "Dashboard{" +
                "buttons=" + buttons +
                '}';
    }
}
