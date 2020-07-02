package ru.geekbrains.cources;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        //С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] integerArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArrayAndPrint(integerArray);

        //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] integerArray2 = new int[8];
        fillArrayAndPrint(integerArray2);

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] integerArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        convertArrayAndPrint(integerArray3);

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        //и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] twoDimensionalArray = new int[4][4];
        fillTwoDimensionalArrayAndPrint(twoDimensionalArray);

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] integerArray5 = {1, 5, 3, 2, 11, 4, 5, 0, 4, 8, 9, 1};
        findMinMaxInArrayAndPrint(integerArray5);

//        6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//         если в массиве есть место, в котором сумма левой и правой части массива равны.
//         Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
//          граница показана символами ||, эти символы в массив не входят.
//
//        7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
//         или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
//         Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//         Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
//         [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
//          При каком n в какую сторону сдвиг можете выбирать сами.

    }

    private static void invertArrayAndPrint(int[] integerArray) {

        System.out.println("#1 before " + Arrays.toString(integerArray));
        for (int i = 0; i < integerArray.length; i++) {
            int cur = integerArray[i];
            if (cur == 0) {
                integerArray[i] = 1;
            } else {
                integerArray[i] = 0;
            }
        }
        System.out.println("    after " + Arrays.toString(integerArray));
    }

    private static void fillArrayAndPrint(int[] integerArray) {
        for (int i = 0, term = 0; i < integerArray.length; i++, term += 3) {
            integerArray[i] = term;
        }

        System.out.println("#2 filled " + Arrays.toString(integerArray));
    }

    private static void convertArrayAndPrint(int[] integerArray) {

        System.out.println("#3 before " + Arrays.toString(integerArray));
        for (int i = 0; i < integerArray.length; i++) {
            int cur = integerArray[i];
            if (cur < 6) {
                integerArray[i] = cur * 2;
            }
        }
        System.out.println("    after " + Arrays.toString(integerArray));
    }

    private static void fillTwoDimensionalArrayAndPrint(int[][] integerArray) {

        int xLength = integerArray.length - 1;
        for (int x = 0; x < integerArray.length; x++) {
            for (int y = 0; y < integerArray[x].length; y++) {
                if (x == y) {
                    integerArray[x][y] = 1;
                } else if (xLength == y) {
                    integerArray[x][y] = 1;
                }

            }
            xLength--;
        }

        System.out.println("#4 filled");
        printTwoDimensionArray(integerArray);
    }

    private static void printTwoDimensionArray(int[][] integerArray) {
        for (int x = 0; x < integerArray.length; x++) {
            for (int y = 0; y < integerArray[x].length; y++) {
                System.out.print(integerArray[x][y] + "\t");
            }
            System.out.println();
        }
    }

    private static void findMinMaxInArrayAndPrint(int[] integerArray) {
        int min = integerArray[0];
        int max = min;

        System.out.println("#5 array " + Arrays.toString(integerArray));
        for (int i = 0; i < integerArray.length; i++) {
            int cur = integerArray[i];

            if (cur < min) {
                min = cur;
            }
            if (cur > max) {
                max = cur;
            }
        }
        System.out.println("      min " + min);
        System.out.println("      max " + max);
    }

    private static boolean checkBalance(int[] integerArray) {
        return false;
    }
}
