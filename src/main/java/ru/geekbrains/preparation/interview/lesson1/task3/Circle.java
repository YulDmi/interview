package ru.geekbrains.preparation.interview.lesson1.task3;

public class Circle extends Figure implements Drawable {
    private final double PI = 3.14;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Круг нарисован");
    }

    public double getPerimeter() {
        return 2*radius*PI;
    }
}
