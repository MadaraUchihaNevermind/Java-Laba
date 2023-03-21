package com.company;

//Реализация класса Треугольник
public class Triangle implements Figure {
    private double a = 0;
    private double h = 0;
    private double b = 0;
    private double c = 0;
    public Triangle( double a, double b ,double c ,double h) //Конструктор класса Triangle
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getA() {  //Геттер переменной а
        return a;
    }

    public void setA(double a) { // Сеттер переменной а
        this.a = a;
    }

    public double getH() { //Геттер переменной h
        return h;
    }

    public void setH(double h) {  // Сеттер переменной h
        this.h = h;
    }

    public double getB() { //Геттер переменной b
        return b;
    }

    public void setB(int b) {   // Сеттер переменной b
        this.b = b;
    }
    @Override
    public double getSquare() { //Реализация функции нахождения площади из интерфейса Figure в классе Triangle
        return ((a * h)/2);
    }

    @Override
    public double getPerimetr() { //Реализация функции нахождения периметра из интерфейса Figure в классе Triangle
        return a + b + c;
    }
}
