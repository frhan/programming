package me.farfaraway.ds.linkedlist;

public interface LinkedList<E>
{
    void addFirst(E e);
    void addLast(E e);
    void addBetween(E e);
    void removeFirstLast(E e);
    void removeLastLast(E e);
    void remove(E e);
}
