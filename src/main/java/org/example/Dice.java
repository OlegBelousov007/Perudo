package org.example;

import java.util.Random;

public class Dice {
    private static final Random random = new Random();
    private int value;

    public void roll() {
        value = random.nextInt(6) + 1; // Кости от 1 до 6
    }

    public int getValue() {
        return value;
    }
}