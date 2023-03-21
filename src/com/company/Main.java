package  com.company;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10); //Объявление объекта класса Circle
        System.out.println(circle.getSquare()); //Вызов функции нахождения площади с последующим выводом данных
        System.out.println(circle.getPerimetr()); //Вызов функции нахождения периметра с последующим выводом данных

        Triangle trangle = new Triangle(1, 2, 4, 5); //Объявление объекта класса Circle
        System.out.println(trangle.getPerimetr()); //Вызов функции нахождения площади с последующим выводом данных
        System.out.println(trangle.getSquare()); //Вызов функции нахождения периметра с последующим выводом данных

        Rectangle rectangle = new Rectangle(5, 6); //Объявление объекта класса Circle
        System.out.println(rectangle.getPerimetr());//Вызов функции нахождения площади с последующим выводом данных
        System.out.println(rectangle.getSquare());//Вызов функции нахождения периметра с последующим выводом данных


        Ellipse ellipse = new Ellipse(45, 78);//Объявление объекта класса Circle
        System.out.println((ellipse.getPerimetr()));//Вызов функции нахождения площади с последующим выводом данных
        System.out.println((ellipse.getSquare()));//Вызов функции нахождения периметра с последующим выводом данных

    }
}
