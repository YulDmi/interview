package ru.geekbrains.preparation.interview.lesson3.task1;

public class Ping implements Runnable {
    PingPong pp;

    public Ping(PingPong pp) {
        this.pp = pp;
    }

    @Override
    public void run() {
        while (true) {
            pp.printPing();
        }
    }
}
