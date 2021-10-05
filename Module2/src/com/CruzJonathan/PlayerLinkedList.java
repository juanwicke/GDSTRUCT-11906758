package com.CruzJonathan;

public class PlayerLinkedList {
    private PlayerNode head;
    private int size;

    public int getSize() {
        return size;
    }

    public void addToFront(Player player){
        // Add to size variable whenever a player is added
        size++;
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head); // Set the added players next node to be the current head.
        // If there is a next element set added player as their previous node
        if(playerNode.getNextPlayer() != null) {
            playerNode.getNextPlayer().setPreviousPlayer(playerNode);
        }
        head = playerNode; // Set the added player to be the head
    }

    public void printList(){
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null){
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
    }

    public void removeFromFront(){
        // Check if there's anything to remove
        if (head != null){
            size--; // Deduct from size variable whenever a player is removed
            var nodeToRemove = head; // Place head node on a temporary variable
            head = nodeToRemove.getNextPlayer(); // Set the head to be the next node
            head.setPreviousPlayer(null); // Set the heads' previous player to be null
        }
        else {
            // If there isn't anything to remove
            System.out.println("No nodes to remove.");
        }
    }

    public boolean contains(Player player){
        PlayerNode current = head;
        // Loop through linked list
        while (current != null){
            // If current node is equal to player return true
            if(current.getPlayer() == player){
                return true;
            }
            current = current.getNextPlayer();
        }
        // If no matches were found
        return false;
    }

    public int indexOf(Player player){
        int index = 0; // Counter for index
        PlayerNode current = head;
        // Loop through linked list
        while (current != null){
            // If current node is equal to player return index
            if(current.getPlayer() == player){
                return index;
            }
            index++;
            current = current.getNextPlayer();
        }
        // If no matches were found return -1 index
        System.out.println("No player.");
        return -1;
    }


}
