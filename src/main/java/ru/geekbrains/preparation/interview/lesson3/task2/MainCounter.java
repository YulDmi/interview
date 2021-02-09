package ru.geekbrains.preparation.interview.lesson3.task2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainCounter {
    private static Lock lock = new ReentrantLock();
    private static int count = 0;

    public static void increment() {
        try {
            lock.lock();
            System.out.println(count++);
        } finally {
            lock.unlock();
        }
    }

    public static void decrement() {
        try {
            lock.lock();
            System.out.println(count--);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    increment();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    decrement();
                }
            }
        }).start();
    }
}

