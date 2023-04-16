package lab5_Andrey;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем префикс у пользователя
        System.out.print("Введите префикс: ");
        String prefix = scanner.nextLine();

        // Создаем массив для хранения строк
        ArrayList<String> strings = new ArrayList<>();

        // Заполняем массив строками
        while (true) {
            System.out.print("Введите строку (или 'стоп' для завершения ввода): ");
            String input = scanner.nextLine();

            if (input.equals("стоп")) {
                break; // Прекращаем ввод строк
            }

            strings.add(input); // Добавляем введенную строку в массив
        }

        // Ищем и выводим строки, которые начинаются с заданного префикса
        System.out.println("Строки, которые начинаются с \"" + prefix + "\":");
        for (String string : strings) {
            if (string.startsWith(prefix)) {
                System.out.println(string);
            }
        }
    }
}

