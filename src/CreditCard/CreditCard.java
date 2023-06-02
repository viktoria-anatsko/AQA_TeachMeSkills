package CreditCard;

import java.util.Scanner;

public class CreditCard {
    private String accountNumber;
    private double balance;
    private String cardHolder;

    public CreditCard() {
        this.accountNumber = "Unknown Card Number";
        this.cardHolder = "Unknown Holder";
    }

    public CreditCard(String accountNumber, String cardHolder, double balance) {
        this.accountNumber = accountNumber;
        this.cardHolder = cardHolder;
        this.balance = balance;
    }

    public void getCardInfo() {
        System.out.println("Credit card information:");
        System.out.println("Credit card number: " + this.accountNumber);
        System.out.println("Credit card holder: " + this.cardHolder);
        System.out.println("Balance: " + this.balance);
    }

    public void addMoney() {
        System.out.println("Enter sum: ");
        Scanner input = new Scanner(System.in);
        {
            balance += input.nextInt();
            System.out.println("Credit card number: " + this.accountNumber);
            System.out.println("Credit card holder: " + this.cardHolder);
            System.out.println("Balance: " + this.balance);
        }
    }

    public void withdrawMoney() {
        System.out.println("Enter amount: ");
        Scanner input = new Scanner(System.in);
        {
            balance -= input.nextInt();
            System.out.println("Credit card number: " + this.accountNumber);
            System.out.println("Credit card holder: " + this.cardHolder);
            System.out.println("Balance: " + this.balance);
            balance--;
        }
    }
}