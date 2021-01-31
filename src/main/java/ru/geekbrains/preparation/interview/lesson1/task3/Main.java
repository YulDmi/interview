package ru.geekbrains.preparation.interview.lesson1.task3;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        print(circle);
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        print(rectangle);
        Triangle triangle = new Triangle(5.0, 4.0, 4.0);
        print(triangle);

    }

    public static void print(Drawable figure) {
        figure.draw();
         if (figure instanceof Figure) {
             Figure f = (Figure) figure;
             System.out.println("Периметр = " + f.getPerimeter());
         }
    }
}
