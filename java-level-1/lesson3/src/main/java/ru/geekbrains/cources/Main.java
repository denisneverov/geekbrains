package ru.geekbrains.cources;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
    //При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
    //После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    public static void main(String[] args) {
        boolean isContinue = true;
        int minBound = 0;
        int maxBound = 9;
        int countAttempts = 1;

        int puzzledNumber = new Random().nextInt(maxBound - minBound + 1) + minBound;
        Scanner scanner = new Scanner(System.in);

        while (isContinue && countAttempts < 4) {
            try {
                System.out.print("Введите число: ");
                int enteredNumber = scanner.nextInt();

                boolean isMore = enteredNumber > puzzledNumber;
                boolean isEquals = enteredNumber == puzzledNumber;

                if (isEquals || countAttempts == 3) {
                    System.out.println("Число " + (isEquals ? "" : "не ") + "угадано - " + puzzledNumber);

                    isContinue = isContinue();
                    if (isContinue) {
                        puzzledNumber = new Random().nextInt(maxBound - minBound + 1) + minBound;
                        countAttempts = 1;
                        continue;
                    } else {
                        break;
                    }
                }

                System.out.println("Введенное число " + (isMore ? "больше" : "меньше") + " загаданного");
                countAttempts++;
            } catch (InputMismatchException e) {
                System.out.print("Введите число! ");
                scanner.next();
            }
        }
    }

    public static boolean isContinue() {
        System.out.print("\nПовторить игру еще раз? (1 – да / 0 – нет): ");
        String nextLine = new Scanner(System.in).nextLine();

        return nextLine.equals("") || nextLine.equals("1");
    }
}
