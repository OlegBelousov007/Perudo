package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Dice> dices;
    private boolean isOut;

    public Player(String name) {
        this.name = name;
        this.dices = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            dices.add(new Dice());
        }
        isOut = false;
    }

    public void rollDices() {
        for (Dice dice : dices) {
            dice.roll();
        }
    }

    public List<Dice> getDices() {
        return dices;
    }

    public String getName() {
        return name;
    }

    public void setOut() {
        isOut = true;
    }

    public boolean isOut() {
        return isOut;
    }
}