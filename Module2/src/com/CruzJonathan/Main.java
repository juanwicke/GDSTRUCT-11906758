package com.CruzJonathan;

public class Main {

    public static void main(String[] args) {
        Player Destroyer = new Player(1,"Destroyer",10);
        Player Wick = new Player(2,"Wick",20);
        Player JuanTAP = new Player(3,"JuanTAP",30);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(Destroyer);
        playerLinkedList.addToFront(Wick);
        playerLinkedList.addToFront(JuanTAP);

        playerLinkedList.printList();

        System.out.println("Size: " + playerLinkedList.getSize());

        System.out.println("Destroyer's index: " + playerLinkedList.indexOf(Destroyer));
        System.out.println("Wick's index: " + playerLinkedList.indexOf(Wick));
        System.out.println("JuanTAP's index: " + playerLinkedList.indexOf(JuanTAP));

        System.out.println("List contains JuanTAP: " + playerLinkedList.contains(JuanTAP));

        System.out.println("Removing node at the front.");

        playerLinkedList.removeFromFront();

        playerLinkedList.printList();

        System.out.println("Size: " + playerLinkedList.getSize());

        System.out.println("Destroyer's index: " + playerLinkedList.indexOf(Destroyer));
        System.out.println("Wick's index: " + playerLinkedList.indexOf(Wick));
        System.out.println("JuanTAP's index: " + playerLinkedList.indexOf(JuanTAP));

        System.out.println("List contains JuanTAP: " + playerLinkedList.contains(JuanTAP));
    }
}
