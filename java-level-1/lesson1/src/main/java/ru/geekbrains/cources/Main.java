package ru.geekbrains.cources;

public class Main {
    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {
        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        char e = 'c';
        float f = 5.0f;
        double g = 6.0d;
        boolean h = true;
        String i = "Hello!";

        System.out.printf("#3 Calc %d * (%d + (%d / %d)) = %.2f\n", a, b, c, d, calc(a, b, c, d));

        boolean sumOfNumbersBetweenTenAndTwenty = isSumOfNumbersBetweenTenAndTwenty(f, g);
        System.out.printf("#4 Is sum of numbers(%.0f, %.0f) between ten and twenty? - %b\n", f, g, sumOfNumbersBetweenTenAndTwenty);

        isPositiveNumber(c);

        System.out.println("#6 Is number " + c + " negative? - " + isNegativeNumber(c));

        helloUsername("Den");

        isLeapYear(2020);
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – входные параметры этого метода;
    public static double calc(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
    // от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean isSumOfNumbersBetweenTenAndTwenty(double a, double b) {
        double result = a + b;

        return result >= 10 && result <= 20;
    }

    //5. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    // Замечание: ноль считаем положительным числом.
    public static void isPositiveNumber(int n) {
        System.out.println("#5 Number " + n + " is " + (n >= 0 ? "positive" : "negative"));
    }

    //6. Написать метод, которому в качестве параметра передается целое число,
    // метод должен вернуть true, если число отрицательное;
    public static boolean isNegativeNumber(int i) {
        return i < 0;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void helloUsername(String name) {
        System.out.printf("#7 Привет, %s!\n", name);
    }

    //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void isLeapYear(int year) {
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                }
            } else {
                leap = true;
            }
        }

        System.out.println("#8 " + year + " is " + (leap ? "a" : "not a") + " leap year.");
    }
}