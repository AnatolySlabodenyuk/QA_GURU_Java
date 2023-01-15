package guru.qa;

public class Main {
    public static void main (String[] args) {

        // Арифметика
        int num1 = 6;
        int num2 = 3;
        System.out.println("Арифметика");
        System.out.println("6 + 3 = " + (num1 + num2)); // сумма
        System.out.println("6 - 3 = " + (num1 - num2)); // вычитание
        System.out.println("6 * 3 = " + (num1 * num2)); // умножение
        System.out.println("6 / 3 = " + (num1 / num2)); // деление
        System.out.println("7 % 3 = " + ((++num1) % num2)); // остаток от деления
        System.out.println("-------------");

        // Логика
        int a = 1;
        int b = 2;
        System.out.println("Логика");
        boolean Result = a == b;
        System.out.println("1 == 2 :" + Result); // проверка на "равно"
        Result = a != b;
        System.out.println("1 != 2 :" + Result); // проверка на "не равно"
        Result = a > b;
        System.out.println("1 > 2 :" + Result); // проверка на "больше"
        Result = a >= b;
        System.out.println("1 >= 2 :" + Result); // проверка на "больше и равно"
        Result = a < b;
        System.out.println("1 < 2 :" + Result); // проверка на "меньше"
        Result = a <= b;
        System.out.println("1 <= 2 :" + Result); // проверка на "меньше и равно"
        System.out.println("-------------");

        // Переполнения
        byte value = 127;
        short value1 = 32767;
        int value2 = 2_147_483_647;
        long value3 = 9_223_372_036_854_775_807L;
        System.out.println("Переполнения");
        System.out.println("Переполнение byte: " + (++value));
        System.out.println("Переполнение short: " + (++value1));
        System.out.println("Переполнение int: " + (++value2));
        System.out.println("Переполнение long: " + (++value3));
        System.out.println("-------------");

        // Комбинации int и double
        int varInt = 1000;
        double varDouble = 3.14;
        System.out.println("Комбинации");
        System.out.println( "1000 + 3.14 = " + (varInt + varDouble));
        System.out.println("1000 - 3.14 = " + (varInt - varDouble));
        System.out.println("1000 * 3.14 = " + (varInt * varDouble));
        System.out.println("1000 / 3.14 = " + (varInt / varDouble));
        System.out.println("1000 % 3.14 = " + (varInt % varDouble));
        System.out.println("-------------");


    }

}
