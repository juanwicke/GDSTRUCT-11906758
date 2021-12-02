package com.CruzJonathan;

public class SimpleHashtable {
    private StoredPlayer[] Hashtable;

    public SimpleHashtable() {
        Hashtable = new StoredPlayer[10];
    }

    private int hashKey(String key) {
        return key.length() % Hashtable.length;
    }

    public void put(String key, Player value) {
        int hashedKey = hashKey(key);

        if (isOccupied(hashedKey)) {
            int stoppingIndex = hashedKey;

            if (hashedKey == Hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (isOccupied(hashedKey) && hashedKey != stoppingIndex) {
                hashedKey = (hashedKey + 1) % Hashtable.length;
            }
        }

        if (isOccupied(hashedKey)) {
            System.out.println("SORRY. There is already an element at position" + " " + hashedKey);
        } else {
            Hashtable[hashedKey] = new StoredPlayer(key, value);
        }
    }

    public Player get(String key) {
        int hashedKey = findKey(key);

        for (int i = 0; 1 < Hashtable.length; i++) {
            if (Hashtable[hashedKey] != null && Hashtable[hashedKey].key.equals(key)) {
                return Hashtable[hashedKey].value;
            }
        }
        return null;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);

        if (Hashtable[hashedKey] != null && Hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }


        int stoppingIndex = hashedKey;

        if (hashedKey == Hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stoppingIndex && Hashtable[hashedKey] != null &&
                !Hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % Hashtable.length;
        }

        if (Hashtable[hashedKey] != null && Hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }
        return -1;
    }


    private boolean isOccupied(int index) {
        return Hashtable[index] != null;
    }

    public void printHashtable() {
        System.out.println("Hashtable: ");
        for (int i = 0; i < Hashtable.length; i++) {
            System.out.println("Element" + i + " " + Hashtable[i]);
        }
    }

    public void remove(String key) {
        int hashedKey = hashKey(key);

        for (int i = 0; i < Hashtable.length; i++) {
            if (Hashtable[hashedKey] != null && Hashtable[hashedKey].key.equals(key)) {
                Hashtable[hashedKey] = null;
            }
        }
        System.out.println(key + "" + "has successfully been removed");
    }
}
