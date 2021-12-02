package com.CruzJonathan;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(69);
        tree.insert(45);
        tree.insert(89);
        tree.insert(156);
        tree.insert(23);
        tree.insert(-78);
        tree.insert(15);
        tree.insert(147);

        tree.traverseInOrder();
        tree.traverseInOrderReverse();

        System.out.println(tree.getMin());
        System.out.println(tree.getMax());
    }
}
