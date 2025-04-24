package datastructures.lists;

import datastructures.interfaces.LinkedList;

import java.util.NoSuchElementException;

public class CustomLinkedList<T> implements LinkedList<T> {
    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head, tail;
    private int size = 0;

    @Override
    public boolean addFirst(T t) {
        Node<T> newNode = new Node<>(t);
        if (head == null) {
            head = tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
        return false;
    }

    @Override
    public boolean addLast(T t) {
        Node<T> newNode = new Node<>(t);
        if (tail == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        return false;
    }

    @Override
    public T removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        T data = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        else {
            tail = null;
        }
        size--;
        return data;
    }

    @Override
    public T removeLast() {
        if (tail == null) {
            throw new NoSuchElementException("List is empty");
        }
        T data = tail.data;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        }
        else {
            head = null;
        }
        size--;
        return data;
    }

    @Override
    public T getFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        return head.data;
    }

    @Override
    public T getLast() {
        if (tail == null) {
            throw new NoSuchElementException("List is empty");
        }
        return tail.data;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }
}
