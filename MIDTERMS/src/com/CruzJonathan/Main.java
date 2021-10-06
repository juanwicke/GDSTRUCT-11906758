package com.CruzJonathan;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
    Random rand = new Random();



    String[] cardNames = {"Jett", "Raze", "Phoenix", "Sage", "Kay/o", "Omen", "Astra", "Breach", "Viper", "Sky"};


    CardStack playerDeck = new CardStack();
    CardStack discardPile = new CardStack();
    CardStack playerHand = new CardStack();

    int initialPileSize = 30;


        for (int i = 0; i < initialPileSize; i++) {
        playerDeck.push(new Card(cardNames[rand.nextInt(cardNames.length)]));
    }

        while (playerDeck.size() > 0) {
        playRound(playerHand, playerDeck, discardPile);
    }


    }

    private static void printDetails(CardStack hand, CardStack deck, CardStack discardPile) {
        System.out.print("Player hand: ");
        hand.printStack();
        System.out.println("\nPlayer hand size: " + hand.size());
        System.out.println("Player deck size: " + deck.size());
        System.out.println("Remove pile size: " + discardPile.size());
        System.out.println("\n");
    }

    private static void playRound(CardStack hand, CardStack deck, CardStack discardPile) {
        Random rand = new Random();
        int selector = rand.nextInt(3);
        int randomAmount = rand.nextInt(5) + 1;


        switch (selector) {
            case 0 -> drawFromDeck(hand, deck, randomAmount);
            case 1 -> discard(hand, discardPile, randomAmount);
            case 2 -> drawFromDiscardPile(hand, discardPile, randomAmount);
        }


        printDetails(hand, deck, discardPile);

    }

    private static void drawFromDeck(CardStack hand, CardStack deck, int amount) {
        int adjustedAmount = amount;
        System.out.println("Removing " + amount + " cards from the deck.");


        if (amount > deck.size()) {

            adjustedAmount = deck.size();
            System.out.println("Remove only " + adjustedAmount + " cards from the deck because there's only " + adjustedAmount + " in the deck.");
        }


        for (int i = 0; i < adjustedAmount; i++) {
            hand.push(deck.pop());
        }
    }

    private static void discard(CardStack hand, CardStack discardPile, int amount) {
        int adjustedAmount = amount;
        System.out.println("Removing " + amount + " cards from your hand.");


        if (amount > hand.size()) {

            adjustedAmount = hand.size();
            System.out.println("Remove only " + adjustedAmount + " cards from your hand because there's only " + adjustedAmount + " in your hand.");
        }


        for (int i = 0; i < adjustedAmount; i++) {
            discardPile.push(hand.pop());
        }
    }

    private static void drawFromDiscardPile(CardStack hand, CardStack discardPile, int amount) {

        int adjustedAmount = amount;
        System.out.println("Drawing " + amount + " cards from the discard pile.");


        if (amount > discardPile.size()) {
            adjustedAmount = discardPile.size();
            System.out.println("Drawing only " + adjustedAmount + " cards from the discard pile because there's only " + adjustedAmount + " in the pile.");
        }


        for (int i = 0; i < adjustedAmount; i++) {
            hand.push(discardPile.pop());
        }
    }
}
