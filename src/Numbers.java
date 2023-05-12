import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        checkNumber();
        System.out.println();

        getOddNumbers();
        System.out.println();

        decreaseNumbers();
        System.out.println();

        sumNumbers();
        getResultsOfMultiplications();
        System.out.println();

        getSequenceOfNumbers();
        System.out.println();

        calculateSquareOfNumbers();
        System.out.println();
    }

    public static Scanner enterData() {
        return new Scanner(System.in);
    }

    public static void checkNumber() {
        System.out.print("Enter number: ");
        int n = enterData().nextInt();
        if (n % 2 == 0) {
            System.out.println("Number " + n + " is even.");
        } else
            System.out.println("Number " + n + " is odd.");
    }

    public static void getOddNumbers() {
        for (int i = 1; i < 100; i ++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void decreaseNumbers() {
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void sumNumbers() {
        System.out.print("Enter positive number: ");
        int n = enterData().nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of positive integers from 1 to " + n + ":  " + sum);
    }

    public static void getResultsOfMultiplications() {
        int n = 1;
        int m = 7;
        while (m < 98) {
            m = 7*n;
            System.out.print(m + " ");
            n++;
        }
    }

    public static void getSequenceOfNumbers() {
        int n = 10;
        for (int i = 0; i > -5*n; i-=5) {
            System.out.print(i + " ");
        }
    }

    public static void calculateSquareOfNumbers() {
        for (int i = 10; i <= 20; i++) {
            System.out.print(i*i + " ");
        }
    }
}
