package me.ff.solution.dsa.datastructure.linkedlist;

public class LinkedListImpl<E> implements LinkedList<E> {

    Node<E> head;
    int size;

    public LinkedListImpl() {
        head = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addFirst(E e) {
        size++;
        if (head == null) {
            head = new Node<E>(e);
            return;
        }

        Node<E> newNode = new Node<E>(e);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public void addLast(E e) {
        size++;
        if (head == null) {
            addFirst(e);
            return;
        }

        Node<E> node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node<E>(e);
    }

    @Override
    public void add(int index, E e) {
        if (index > size - 1)
            throw new IndexOutOfBoundsException("Index is out of bound");
        size++;

        if (index == 0) {
            addFirst(e);
            return;
        }

        Node<E> newNode = new Node<>(e);
        int currentPosition = 0;
        Node<E> node = head;

        while (currentPosition < index){
            if (currentPosition == (index - 1)){
                newNode.next = node.next;
                node.next = newNode;
                break;
            }
            node = node.next;
            currentPosition++;
        }
    }

    @Override
    public E element() {
        if (head == null)
            return null;
        return head.element();
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void show() {
        if (head == null)
            return;

        Node<E> node = head;
        while (node != null){
            System.out.print(node.data);
            node = node.next;
            if (node != null)
                System.out.print(" -> ");
        }
    }

}
