package ru.geekbrains.preparation.interview.lesson1.task3;

public class Triangle extends Figure implements Drawable {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void draw() {
        System.out.println("Треугольник нарисован");
    }

    public double getPerimeter() {
        return   (side1 + side2 + side3);
    }
}
