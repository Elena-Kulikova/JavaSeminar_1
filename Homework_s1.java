import java.util.Arrays;

public class Homework_s1 {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 10)); // true
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(0)); // false
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println();

        System.out.println(isLeapYear(2024)); // true
        System.out.println(isLeapYear(2023)); // false

        int[] arr = createArray(5, 10);
        System.out.println(Arrays.toString(arr)); // [10, 10, 10, 10, 10]
        
        int[] array = { 0, 0, 1, 0, 1, 1, 1, 0, 1 };
        changeNumber(array);
        System.out.println(Arrays.toString(array));
        System.out.println();

        int[] array1 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        increaseNumber(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println();

        int[][] squareArr = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x],[0, 0, 0, 1]]
        diagonalSquare(squareArr);
    }

    // 1.Написать метод, принимающий на вход два числа, и проверяющий что их
    // сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
    // true, в противном случае – false
    public static boolean isSumBetween10And20(int a, int b) {
        return (10 <= a + b) && (a + b <= 20);
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0) {
            return true;
        }
        return false;
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 0; i <= repeat; i++) {
            System.out.print(source);
        }
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    private static int[] createArray(int len, int initalValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++)
            arr[i] = initalValue;
        return arr;
    }

    // /**
    // * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
    // заменить 0 на 1, 1 на 0;
    // *
    static void changeNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }

        }
    }

    // 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static void increaseNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
    }

//  3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//  и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//  Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, 
// то есть [0][0], [1][1], [2][2], …, [n][n];
//  Также заполнить элементы побочной диагонали

public static void diagonalSquare(int[][] squareArr) {
    for (int i = 0; i < squareArr.length; i++) {
        for (int j = 0, x = squareArr[i].length - 1; j < squareArr[i].length; j++, x--) {
            if (i == j || i == x)
                squareArr[i][j] = 1;
            else
                squareArr[i][j] = 0;
            System.out.print(squareArr[i][j] + " ");
        }
        System.out.print("\n");
    }
}
}


