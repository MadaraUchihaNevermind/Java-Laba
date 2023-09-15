import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        InsuranceContract carInsurance = new InsuranceContract(10000, "Автострахование");
        Derivative derivative = new Derivative(carInsurance, 5000);

        // Сериализация объекта в файл
        try {
            FileOutputStream fileOut = new FileOutputStream("derivative.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(derivative);
            out.close();
            fileOut.close();
            System.out.println("Объект успешно сериализован в файл.");
        } catch(IOException e) {
            e.printStackTrace();
        }

        // Десериализация объекта из файла
        Derivative deserializedDerivative = null;
        try {
            FileInputStream fileIn = new FileInputStream("derivative.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedDerivative = (Derivative) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Объект успешно десериализован из файла.");
        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (deserializedDerivative != null) {
            System.out.println("Страховое обязательство: " + deserializedDerivative.getInsuranceContract().getType());
            System.out.println("Стоимость дериватива: " + deserializedDerivative.getValue());
        }
    }
}