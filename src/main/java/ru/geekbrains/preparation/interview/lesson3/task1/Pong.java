package ru.geekbrains.preparation.interview.lesson3.task1;

public class Pong implements Runnable {
    PingPong pp;

    public Pong(PingPong pp) {
        this.pp = pp;
    }

    @Override
    public void run() {
        while (true) {
            pp.printPong();
        }
    }
}
