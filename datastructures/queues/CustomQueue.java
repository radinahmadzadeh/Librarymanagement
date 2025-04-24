package datastructures.queues;

import datastructures.interfaces.Queue;
import datastructures.lists.CustomLinkedList;

public class CustomQueue<T> implements Queue<T> {
    private CustomLinkedList<T> list;

    public CustomQueue() {
        list = new CustomLinkedList<>();
    }

    @Override
    public boolean add(Object t) {
        return list.addLast((T) t);
    }

    @Override
    public boolean offer(Object t) {
        return list.addLast((T) t);
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
