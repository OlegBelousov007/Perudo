package org.example;

import java.util.*;

public class Round {
    private List<Player> players;
    private Player currentPlayer;
    private int currentBetValue; // Номинал
    private int currentBetAmount; // Количество

    public Round(List<Player> players) {
        this.players = players;
        this.currentPlayer = players.get(0); // Начало с первого игрока
    }

    public void start() {
        // Логика раунда, включая процесс ставок и проверки
    }

    // Метод для повышения ставки
    public void increaseBet(int amount, int value) {
        // Логика повышения ставки
        this.currentBetAmount = amount;
        this.currentBetValue = value;
    }

    // Метод для проверки ставок
    public boolean checkBet() {
        // Логика проверки
        return false;
    }
}