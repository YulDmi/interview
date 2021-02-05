package ru.geekbrains.preparation.interview.lesson2;

import java.util.Arrays;

public class MyArrayList<E extends Comparable<? super E>> implements MyList<E> {
    public static final int DEFAULT_CAPACITY = 8;

    private E[] arr;

    private int size;

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(int capacity) {
        arr = (E[]) new Comparable[capacity];
    }


    public E get(int index) {
        return arr[index];
    }

    public boolean remove(int index) {
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null;

        return true;
    }

    public boolean add(E element) {
        if (size == arr.length - 1) {
            resize(arr.length * 2);
        }
        arr[size++] = element;
        return true;
    }

    private void resize(int newLength) {
        arr = Arrays.copyOf(arr, newLength);
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arr[i] + " ");
        }
        return sb.toString().trim();
    }
}
