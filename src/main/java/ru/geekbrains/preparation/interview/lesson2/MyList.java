package ru.geekbrains.preparation.interview.lesson2;

public interface MyList<E> {

    E get(int index);
    boolean remove(int index);
    boolean add(E element);
    int size();

}
