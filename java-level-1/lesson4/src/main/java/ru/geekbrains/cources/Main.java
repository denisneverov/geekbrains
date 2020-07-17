package ru.geekbrains.cources;

import java.util.Scanner;

public class Main {
    //Крестики-нолики
    public static Scanner sc = new Scanner(System.in);

    public static char[][] map;
    public final static int SIZE = 5;
    public final static int COUNT_SYMBOLS = 4;

    public final static char DOT_X = 'X';
    public final static char DOT_O = 'O';
    public final static char EMPTY_DOT = '•';

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (isWinIntelligent(DOT_X)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Game ended in draw");
                break;
            }
            aITurn();
            printMap();
            if (isWinIntelligent(DOT_O)) {
                System.out.println("YOU LOSE(((((((!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Game ended in draw");
                break;
            }
        }
    }

    private static boolean isMapFull() {
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY_DOT) {
                    count++;
                }
            }
        }
        return count == 0;
    }

    private static void aITurn() {
        int x, y;
        do {
            x = (int) (Math.random() * SIZE);
            y = (int) (Math.random() * SIZE);
        } while (!isTurnValid(x, y));
        map[y][x] = DOT_O;
    }

    private static boolean isTurnValid(int x, int y) {
        if (x < 0 || x > SIZE - 1 || y < 0 || y > SIZE - 1) {
            return false;
        }
        if (map[y][x] == EMPTY_DOT) {
            return true;
        }
        return false;
    }

    private static void humanTurn() {
        int x, y;
        System.out.println("Please input dot coordinates, in format x y");
        do {
            x = sc.nextInt();
            y = sc.nextInt();
        } while (!isTurnValid(x - 1, y - 1));
        map[y - 1][x - 1] = DOT_X;
    }

    private static void printMap() {
        for (int i = 1; i <= SIZE; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + "\t");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY_DOT;
            }
        }
    }

    private static boolean isWin(char symbol) {
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) {
            return true;
        }
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) {
            return true;
        }
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) {
            return true;
        }
        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) {
            return true;
        }
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) {
            return true;
        }
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) {
            return true;
        }
        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) {
            return true;
        }
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) {
            return true;
        }

        return false;
    }

    //2. Переделать проверку победы, чтобы она не была реализована просто набором условий,
    //например, с использованием циклов.
    //3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.
    //Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
    private static boolean isWinIntelligent(char symbol) {
        int countBlocks = SIZE - COUNT_SYMBOLS + 1;

        for (int i = 0; i < countBlocks; i++) {
            for (int j = 0; j < countBlocks; j++) {
                if (isWinDiagonal(symbol, i, j) || isWinLines(symbol, i, j)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean isWinLines(char symbol, int shiftX, int shiftY) {
        for (int i = shiftX; i < COUNT_SYMBOLS + shiftX; i++) {
            boolean result = true;

            for (int j = shiftY; j < COUNT_SYMBOLS + shiftY && result; j++) {
                result = map[i][j] == symbol || map[j][i] == symbol;
            }

            if (result) {
                return true;
            }
        }

        return false;
    }

    private static boolean isWinDiagonal(char symbol, int shiftX, int shiftY) {
        boolean result = true;

        for (int i = 0; i < COUNT_SYMBOLS && result; i++) {
            int shiftedX = i + shiftX;
            int shiftedY = i + shiftY;

            result = map[shiftedX][shiftedY] == symbol || map[COUNT_SYMBOLS - shiftedX - 1][shiftedY] == symbol;
        }

        return result;
    }
}