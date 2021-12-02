package com.CruzJonathan;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        Scanner playerInput = new Scanner(System.in);
        Random dice = new Random();

        ArrayQueue newQueue = new ArrayQueue(10);

        Player One = new Player(1, "Enard", 1652);
        Player Two = new Player(2, "Mynats", 250);
        Player Three = new Player(3, "xXDestroyer_12Xx", 70);
        Player Four = new Player(4, "Jenkins6969", 69);
        Player Five = new Player(5, "ImAdopted", 9000);

        int game = 0;
        while (game < 10) {
            System.out.println("Matches found: " + game);
            int randLoop = 1 + dice.nextInt(7);
            for (int loop = 0; loop < randLoop; loop++) {
                int PlayerDice = 1 + dice.nextInt(5);
                switch (PlayerDice) {
                    case 1 -> newQueue.add(One);
                    case 2 -> newQueue.add(Two);
                    case 3 -> newQueue.add(Three);
                    case 4 -> newQueue.add(Four);
                    case 5 -> newQueue.add(Five);
                }
            }

            newQueue.printQueue();
            if (newQueue.size() >= 5) {
                System.out.println("Finding game. Please wait...");
                System.out.println("Matchmaking completed...");
                for(int i = 0; i < 5; i++){
                    System.out.println(newQueue.remove() + " Joining Game...");
                }
                game++;

            } else {
                System.out.println("Disconnect matchmaking...");
            }
        }
    }
}

