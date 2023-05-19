import java.util.Arrays;
import java.util.Scanner;

public class MultiArrays {
    public static void main(String[] args) {
        increaseArrayElements();
        System.out.println();

        createChessboard();
        System.out.println();

        multiplyArrays();
        System.out.println();

        sumElementsOfArray();
        System.out.println();

        getDiagonals();
        System.out.println();

        sortArray();
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static void increaseArrayElements() {
        System.out.println("Enter a number to increase array elements: ");
        int n = input().nextInt();

        int[][][] array = new int[][][] {
                {{2, 15, 7}, {-1, 55, 29}, {4, 0}},
                {{11, 3}, {17, -8, 33}}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += n;
                }
            }
        } System.out.println(Arrays.deepToString(array));
    }

    public static void createChessboard() {
        String[][] array = new String[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == j % 2) {
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void multiplyArrays() {
        int[][] array1 = new int[][] {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array2 = new int[][] {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] array3 = new int[array1.length][array2[0].length];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array2.length; k++) {
                    array3[i][j] += array1[i][k]* array2[k][j];
                }
            }
        }
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void sumElementsOfArray() {
        int[][] array = new int[][] {{11, -4, 9}, {2, 0, -5}, {13, -19}, {22, -10, 5, 17}};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void getDiagonals() {
        int[][] array = new int[][]{{4, 18, -1, 8}, {9, -13, 0, -2}, {5, 29, 11, 0}, {33, -20, 1, 15}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == array.length - 1 - i) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void sortArray() {
        int[][] array = new int[][] {{77, 0, -9, 16}, {1, 23, -7}, {86, 4, -48}};
        int num;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = j + 1; k < array.length; k++ ) {
                    if (array[i][j] > array[i][k]) {
                     num = array[i][j];
                     array[i][j] = array[i][k];
                     array[i][k] = num;
                    }
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}