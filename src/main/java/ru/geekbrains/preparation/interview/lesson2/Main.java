package ru.geekbrains.preparation.interview.lesson2;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList<>();
        mll.add(5);
        mll.add(55);
        mll.add(15);
        mll.add(51);
        mll.add(52);

        System.out.println(mll);
        System.out.println(mll.size());
        System.out.println(mll.get(3));

        mll.remove(3);
        System.out.println(mll);


        MyArrayList<Integer> mal = new MyArrayList<>();

        for (int i = 0; i < 16; i++) {
            mal.add(i);
        }

        System.out.println(mal);
        mal.remove(2);
        System.out.println(mal);
        mal.remove(7);
        System.out.println(mal);
        mal.add(2);
        System.out.println(mal);
        System.out.println(mal.size());
        System.out.println(mal.get(2));
    }
    }

