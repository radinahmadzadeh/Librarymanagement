package datastructures.interfaces;

public interface LinkedList<T> extends List{
    boolean addFirst(T t);
    boolean addLast(T t);
    T removeFirst();
    T removeLast();
    T getFirst();
    T getLast();
    void clear();
}
