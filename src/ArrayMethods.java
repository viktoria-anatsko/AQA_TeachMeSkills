import java.util.Scanner;
import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        checkNumberInArray();
        System.out.println();

        removeNumberFromArray();
        System.out.println();

        createArrayRandom();
        System.out.println();

        compareArrays();
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static void checkNumberInArray() {
        int[] array = new int[] {7, 6, 5, 0, 15, 26, 39, 6, 3, 6};
        System.out.println("Enter integer number: ");
        int num = input().nextInt();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("You number isn't included in this array.");
        } else {
            System.out.println("You number is included in this array " + count + " times.");
        }
    }

    public static void removeNumberFromArray() {
        int[] array1 = new int[] {8, 17, 1, 99, 1, 27, 49, 64};
        System.out.println("Enter integer number: ");
        int num1 = input().nextInt();
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == num1) {
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("You number isn't included in this array.");
            return;
        }

        int[] array2 = new int[array1.length-count];
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != num1) {
                array2[j] = array1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }

    public static void createArrayRandom() {
        System.out.println("Enter the size of the array: ");
        int size = input().nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 61) - 30);
        }
        System.out.println("Created array: " + Arrays.toString(array));

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("Element with maximum value: " + max);

        int min = array[0] + 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Element with minimum value: " + min);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avr = (double) sum/size;
        System.out.println("Average value of array elements: " + avr);
    }

    public static void compareArrays() {
        int[] arr1 = new int[] {12, 0, 3, 56, -4};
        int[] arr2 = new int[] {3, -8, 17, 1, 29};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        double avr1 = (double) sum1/5;

        int sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        double avr2 = (double) sum2/5;

        if (avr1 > avr2) {
            System.out.println("Average value of the elements of the first array: " + avr1 + " is larger.");
        } else if (avr1 < avr2) {
            System.out.println("Average value of the elements of the second array: " + avr2 + " is larger.");
        } else if (avr1 == avr2) {
            System.out.println("The averages of the arrays are equal. " + avr1);
        }
    }
}