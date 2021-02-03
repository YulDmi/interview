package ru.geekbrains.preparation.interview.lesson1;

public class Task2 {
    //граматическая ошибка в названии интерфейсов Movable Stoppable
    //в классе Car поле Engine имеет отличный от других модификатором доступа. К методу start доступ ограничен. Ограниченный доступ к классу и к абстрактному методу open();
    //в классе LightWeightCar  Возможно надо добавить интерфейс Stoppable, реализовать метод stop();
    //в классе Lorry extends Car implement Movable, Stoppable. Так же нет реализации метода родительского класса open(). над методами интерфейсов аннотацию @Override
}
