package AdditionalTask;

import java.util.Scanner;

public class BankDeposit {
    public static void main(String[] args) {
        getDepositInfo();
        }
    public static Scanner enterData() {
        return new Scanner(System.in);
    }

    public static void getDepositInfo() {
        System.out.println("Enter the amount of your deposit: ");
        float sum1 = enterData().nextFloat();
        float sum = 0;
        System.out.println("Enter number of months: ");
        int m = enterData().nextInt();

        for (int i = 1; i <= m; i++) {
            sum1 = (float) (sum1 + 0.07*sum1);
        }
            sum += sum1;
            System.out.println(sum);
    }
}

