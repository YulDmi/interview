package ru.geekbrains.preparation.interview.lesson3.task1;

public class PingPong {
    static boolean flag = true;

    public synchronized void printPing() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "  Ping");

        flag = false;
        notify();
    }

    public synchronized void printPong() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "  Pong");
        flag = true;
        notify();
    }
}
