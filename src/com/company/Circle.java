package com.company;

//Реализация класса Circle
public class Circle implements Figure {
    private double radius = 0;
    public Circle(double radius) //Конструктор класса Circle
    {
        this.radius = radius;
    }
    public double getRadius() { //Геттер переменной radius
        return radius;
    }

    public void setRadius(double radius) { //Сеттер переменной radius
        this.radius = radius;
    }

    @Override
    public double getSquare() {    //Реализация функции нахождения площади из интерфейса Figure в классе Circle
        return Math.PI *Math.pow(radius,2);
    }

    @Override
    public double getPerimetr() {  //Реализация функции нахождения периметра из интерфейса Figure в классе Circle
        return Math.PI * 2 *radius;
    }


}



