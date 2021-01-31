package ru.geekbrains.preparation.interview.lesson1.task3;

public class Rectangle extends Figure implements Drawable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }



    public void draw() {
        System.out.println("Прямоугольник нарисован");
    }

    public double getPerimeter() {
        return  (width*2.0 + height*2.0);
    }
}
