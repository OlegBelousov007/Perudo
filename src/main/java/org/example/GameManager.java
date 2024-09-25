package org.example;

import java.util.*;

public class GameManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Player> players = new ArrayList<>();

        // Создание игроков
        System.out.println("Введите количество игроков (от 2 до 6): ");
        int numberOfPlayers = scanner.nextInt();
        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.println("Введите имя игрока " + i + ": ");
            players.add(new Player(scanner.next()));
        }

        Game game = new Game(players);
        game.start();

        System.out.println("Игра закончилась!");
    }
}