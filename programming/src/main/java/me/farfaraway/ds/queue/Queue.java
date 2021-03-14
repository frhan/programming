package me.farfaraway.ds.queue;

public interface Queue<E> {
    boolean offer(E t);
    E poll();
    E peek();
}
