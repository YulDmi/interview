package ru.geekbrains.preparation.interview.lesson2;

public class MyLinkedList<E extends Comparable<? super E>> implements MyList<E> {
    private MyNode<E> first;
    private MyNode<E> last;
    private int size;


    @Override
    public E get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return getNode(index).element;
    }

    @Override
    public boolean remove(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0) {
            MyNode<E> node = first.next;
            first.element = null;
            first.prev = null;
            first.next = null;
            node.prev = null;
            first = node;
        } else if (index == size - 1) {
            MyNode<E> node = last.prev;
            last.element = null;
            last.next = null;
            last.prev = null;
            node.next = null;
            last = node;
        } else {
            MyNode<E> node = getNode(index);
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.element = null;
            node.next = null;
            node.prev = null;
        }
        size--;
        return true;
    }


    @Override
    public boolean add(E element) {
        if (size == 0) {
            first = new MyNode<>(element, null, null);
        } else if (size == 1) {
            last = new MyNode<>(element, null, first);
            first.next = last;
        } else {
            MyNode<E> node = new MyNode<>(element, null, last);
            last.next = node;
            last = node;
        }
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    private static class MyNode<E> {
        E element;
        MyNode<E> next;
        MyNode<E> prev;

        public MyNode(E element, MyNode<E> next, MyNode<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private MyNode<E> getNode(int index) {
        int count = 0;
        MyNode<E> node = first;
        while (count < index) {
            node = node.next;
            count++;
        }
        return node;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        MyNode<E> node = first;
        for (int i = 0; i < size; i++) {
            sb.append(node.element).append(" ");
            node = node.next;
        }
        return sb.toString().trim();
    }
}
