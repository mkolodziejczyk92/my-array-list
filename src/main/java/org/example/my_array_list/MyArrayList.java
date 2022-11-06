package org.example.my_array_list;

import java.util.Arrays;

public class MyArrayList<T> implements MyArrayListMethod {

    Object[] arrayForArrayList;
    private int index = 0;
    private final int DEFAULT_SIZE = 10;
    private int capacity = 10;




    public MyArrayList() {

        arrayForArrayList = new Object[DEFAULT_SIZE];
    }

    @Override // READY TO USE
    public void add(Object data) {
        if (capacity == index + 1) {
            arrayForArrayList = Arrays.copyOf(arrayForArrayList, capacity + 10);
            capacity += 10;
        }
        arrayForArrayList[index] = data;
        this.index++;

    }

    @Override // READY TO USE
    public void removeFirst(Object data) {
        Object[] arrayForRemove = new Object[index];
        int newIndex = 0;
        while (!arrayForArrayList[newIndex].equals(data)) {
            arrayForRemove[newIndex] = arrayForArrayList[newIndex];
            newIndex++;
        }
        newIndex++;
        while (arrayForArrayList[newIndex] != null && newIndex != arrayForArrayList.length - 1) {
            arrayForRemove[newIndex - 1] = arrayForArrayList[newIndex];
            newIndex++;
        }
        arrayForArrayList = arrayForRemove;
        this.index--;
    }

    @Override // READY TO USE
    public void remove(int index) {
        Object[] arrayForRemove = new Object[this.index];
        int newIndex = 0;
        while (newIndex != index) {
            arrayForRemove[newIndex] = arrayForArrayList[newIndex];
            newIndex++;
        }
        newIndex++;
        while (arrayForArrayList[newIndex] != null && newIndex != arrayForArrayList.length - 1) {
            arrayForRemove[newIndex - 1] = arrayForArrayList[newIndex];
            newIndex++;
        }
        arrayForArrayList = arrayForRemove;
        this.index--;
    }

    @Override // READY TO USE
    public void removeAll(Object data) {
        int counter = 0;
        Object[] arrayForRemoveAll2 = Arrays.copyOf(arrayForArrayList, index);
        for (int i = 0; i < arrayForRemoveAll2.length; i++) {
            if(arrayForRemoveAll2[i].equals(data)){
                arrayForRemoveAll2[i] = null;
                counter++;
            }
        }
        Object[] arrayForRemoveAll1 = new Object[arrayForRemoveAll2.length - counter];
        int counter2 = 0;
        for (int i = 0; i < arrayForRemoveAll2.length; i++) {
            if(arrayForRemoveAll2[i] != null){
                arrayForRemoveAll1[counter2] = arrayForRemoveAll2[i];
                counter2++;
            }
        }
        arrayForArrayList = Arrays.copyOf(arrayForRemoveAll1, arrayForRemoveAll1.length);
        this.index -= counter;
    }

    @Override // READY TO USE
    public int size() {
        return this.index;
    }

    @Override // READY TO USE
    public boolean isEmpty() {
        return this.index == 0;
    }


    @Override // READU TO USE
    public void clear() {
        arrayForArrayList = new Object[DEFAULT_SIZE];
        this.index = 0;
    }

    @Override // READY TO USE
    public Object get(int indexPosition) {
        if (arrayForArrayList[indexPosition] == null) {
            throw new IndexOutOfBoundsException();
        }
        return arrayForArrayList[indexPosition];
    }

    @Override // READY TO USE
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            if (arrayForArrayList[i] != null) {
                sb.append(arrayForArrayList[i]).append(", ");
            }
        }
        String result = sb.toString();
        result = result.substring(0, result.length() - 2);
        return "[" + result + "]";
    }
}
