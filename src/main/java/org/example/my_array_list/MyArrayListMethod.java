package org.example.my_array_list;

public interface MyArrayListMethod<T> {

    void add(T data);
    void removeFirst(T data);
    int size();
    void clear();
    T get(int indexPosition);
    boolean isEmpty();
    void removeAll(T data);
    void remove(int index);
}
