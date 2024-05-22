import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        boolean result = sumTwo(8, 6);
        System.out.println("Результат для (8, 6): " + result);
        number(-3);
        boolean result2 = negativeNumber(-10);
        System.out.println("Результат для -10: " + result2);
        printer("Friday", 3);
        boolean result1 = years(2024);
        boolean result3 = years(2023);
        System.out.println("2024 год високосный -" + result1);
        System.out.println("2023 год невисокосный -" + result3);
        int[] array = {0, 1, 0, 1};
        modifyArrays(array);
        moreThan();
        multiply();
        print();
        writen();
    }

    //    задание 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //      задание 2
    public static void checkSumSign() {
        int a = -4;
        int b = -2;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //    задание 3
    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
        System.out.println();
    }

    //    задание 4
    public static void compareNumbers() {
        int a = -4, b = -2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //    задание 5
    public static boolean sumTwo(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    //     задание 6
    public static void number(int number) {
        if (number >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }

    //    задание 7
    public static boolean negativeNumber(int number) {
        return (number < 0);
    }

    //    задание 8
    public static void printer(String text, int count) {
        for (int i = 0; i < count; i++)
            System.out.println(text);
    }

    //   задание 9
    public static boolean years(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    //   задание 10
    public static void modifyArrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
        System.out.println("Модифицированный массив: " + Arrays.toString(array));
    }

    //    задание 11
    public static void moreThan() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Массив: " + Arrays.toString(array));

    }

    //    задание 12
    public static void multiply() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(array));
    }

    // Задание 13
    public static void print() {
        int size = 5;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
        }

        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    //   задание 14
    public static int[] intel(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    public static void writen() {
        int[] resultArray = intel(5, 10);
        System.out.print("Инициализированный массив: ");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
}
