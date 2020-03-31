package me.ff.solution.hackerrank.datastructure.linkedlist;

class Node<E> {
    E data;
    Node next;

    public Node(E e){
        this.data = e;
        this.next = null;
    }

    public E element(){
        return data;
    }
}
