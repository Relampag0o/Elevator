package org.example.elevatorParts;

public enum ButtonType {
    STOP(0), OPEN(-1), CLOSE(-2), ALARM(-3),ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10);

    private final int number;

    ButtonType(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static ButtonType getButtonType(int number) {
        for (ButtonType buttonType : ButtonType.values()) {
            if (buttonType.getNumber() == number) {
                return buttonType;
            }
        }
        return null;
    }
}
