package org.example;

import java.util.*;

public class Game {
    private List<Player> players;
    private Round currentRound;

    public Game(List<Player> players) {
        this.players = players;
    }

    public void start() {
        while (players.size() > 1) {
            currentRound = new Round(players);
            currentRound.start();
            // Логика завершения раунда и проигрыша
        }
    }
}