package me.ff.solution;

import me.ff.solution.dsa.datastructure.linkedlist.LinkedList;
import me.ff.solution.dsa.datastructure.linkedlist.LinkedListImpl;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        LinkedList<Integer> linkedList = new LinkedListImpl<>();
        linkedList.addFirst(10);
        linkedList.addFirst(11);
        linkedList.add(1,20);
        linkedList.addLast(22);
        linkedList.show();

    }
}
