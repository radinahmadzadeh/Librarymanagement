package datastructures.stacks;

import datastructures.interfaces.Queue;
import datastructures.lists.CustomLinkedList;

public class CustomStack<T> implements Queue<T> {
    private CustomLinkedList<T> list;

    public CustomStack() {
        list = new CustomLinkedList<>();
    }

    @Override
    public boolean add(Object t) {
        return list.addFirst((T) t);
    }

    @Override
    public boolean offer(Object t) {
        return list.addFirst((T) t);
    }

    @Override
    public T remove() {
        return list.removeFirst();
    }

    @Override
    public T poll() {
        if (list.isEmpty()) {
            return null;
        }
        else {
            return list.removeFirst();
        }
    }

    @Override
    public T element() {
        return list.getFirst();
    }

    @Override
    public T peek() {
        if (list.isEmpty()) {
            return null;
        }
        else {
            return list.getFirst();
        }
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }
}