package com.company;

//Реализация класса Ellipse
public class Ellipse implements Figure {

    private double a;
    private double b;

    public Ellipse(double a, double b) { //Конструктор класса Ellipse
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    } //Геттер переменной а

    public void setA(double a) {
        this.a = a;
    } //Сеттер переменной а

    public double getB() {
        return b;
    } //Геттер переменной b

    public void setB(double b) {
        this.b = b;
    } //Сеттер переменной b

    @Override
    public double getSquare() {    //Реализация функции нахождения площади из интерфейса Figure в классе Ellipse
        return a * b * Math.PI;
    }

    @Override
    public double getPerimetr() {
        return 4 * ((Math.PI * a * b + Math.pow((a - b), 2)) / a + b);  //Реализация функции нахождения периметра из интерфейса Figure в классе Ellipse
    }
}
