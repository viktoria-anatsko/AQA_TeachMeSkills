/*
Добро пожаловать. Это многолинейный комментарий. Пишем что хотим и сколько хотим.
 */

import java.util.Scanner;

// Главная реализация моего объекта это Класс
class Main
{
    public static void main(String[] args)
    {
        // Этот код выводит сообщение, one-line comment
        // Legacy Code - код написанный другим программистом и скорее всего
        // на старой версии языка
        // Java - это чаще всего 1.8 (Java 8)

        System.out.print("");
        System.out.println();

        // new line - symbol, \n

        System.out.print("Please, enter your name: " + "Archil Sikharulidze");
        System.out.println();
        System.out.println("Please, enter your surname: ");
        System.out.println("Please, enter your age: ");

        System.out.println("Let's calculate sum of 5 + 10: " + (5 + 10));
        System.out.println("Archil" + " " + "Sikharulidze" +
                ". Welcome to my First " +
                "Lesson to...........");

        // This is an example comment for Git
        System.out.println();
        System.out.print("Please, enter your name & surname: ");

        // Создание нового объекта scanner. Сканер считывает данные из источника, распознаёт и обрабатывает.
        Scanner scanner = new Scanner(System.in);
        // Указываем источник для сканера - строку с текстом.
        scanner.nextLine();

        // Типы данных в Java.

        String name = "123";
        int age = 34;
        double weight = 88.1;
        char symbol = 'A';
    }
}