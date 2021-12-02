package com.CruzJonathan;

public class Main {

    public static void main(String[] args) {

        Player One = new Player(1, "Enard", 1652);
        Player Two = new Player(2, "Mynats", 250);
        Player Three = new Player(3, "xXDestroyer_12Xx", 70);
        Player Four = new Player(4, "Jenkins6969", 69);
        Player Five = new Player(5, "ImAdopted", 9000);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(One.getUsername(), One);
        hashtable.put(Two.getUsername(), Two);
        hashtable.put(Three.getUsername(), Three);
        hashtable.put(Four.getUsername(), Four);
        hashtable.put(Five.getUsername(), Five);

        hashtable.printHashtable();
        hashtable.remove("Mynats");
        System.out.print("\n");
        hashtable.printHashtable();
    }
}
