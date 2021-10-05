package com.CruzJonathan;

public class PlayerNode {
    private Player player;
    private PlayerNode nextPlayer;
    private PlayerNode previousPlayer;

    public PlayerNode(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerNode getNextPlayer() {
        return nextPlayer;
    }
    public PlayerNode getPreviousPlayer() {
        return previousPlayer;
    }

    public void setNextPlayer(PlayerNode nextPlayer) {
        this.nextPlayer = nextPlayer;
    }
    public void setPreviousPlayer(PlayerNode previousPlayer) {
        this.previousPlayer = previousPlayer;
    }

}
