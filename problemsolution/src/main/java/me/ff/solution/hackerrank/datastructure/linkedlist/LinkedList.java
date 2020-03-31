package me.ff.solution.hackerrank.datastructure.linkedlist;

public interface LinkedList<E> {

    boolean isEmpty();

    /*
     * Inserts the specified element at the beginning of this list.
     */
    void addFirst(E e);

    /*
    * Appends the specified element to the end of this list.
     */
    void addLast(E e);

    void add(int index, E e);

    /*
    * Retrieves, but does not remove, the head (first element) of this list.
     */
    E element();

    E get(int index);

    int size();

    void show();
}
