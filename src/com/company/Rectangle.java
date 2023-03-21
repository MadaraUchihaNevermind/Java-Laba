package com.company;

//Реализация класса Прямоугольник
public class Rectangle implements Figure {
    private double a;
    private  double b;
    public Rectangle(int a ,int b) //Конструктор класса Triangle
    {
        this.a = a;
        this.b = b;
    }

    public double getA() { //Геттер переменной а
        return a;
    }

    public void setA(double a) { // Сеттер переменной а
        this.a = a;
    }

    public double getB() { // Сеттер переменной b
        return b;
    }

    public void setB(double b) { //Геттер переменной  b
        this.b = b;
    }

    @Override
    public double getSquare() {   //Реализация функции нахождения площади из интерфейса Figure в классе Rectangle
        return a * b;
    }

    @Override
    public double getPerimetr() {  //Реализация функции нахождения периметра из интерфейса Figure в классе Rectangle
        return a * 2 + b * 2;
    }
}
