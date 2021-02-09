package ru.geekbrains.preparation.interview.lesson3.task1;

public class Main {
    public static void main(String[] args) {
        PingPong pingPong = new PingPong();

        new Thread(new Ping(pingPong)).start();
        new Thread(new Pong(pingPong)).start();
    }
}
