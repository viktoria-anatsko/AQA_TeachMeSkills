package CreditCard;

public class CreditCard {
    private String accountNumber;
    private double balance;
    private double accrual;
    private double writeOff;

    public CreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getAccrual() {
        return accrual;
    }

    public double getWriteOff() {
        return writeOff;
    }

    public void setAccrual(double accrual) {
        this.accrual = accrual;
    }

    public void setWriteOff(double writeOff) {
        this.writeOff = writeOff;
    }

    public void getCardInfo() {
        System.out.println("Credit card information:");
        System.out.println("Credit card number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void addMoney() {
        double newBalance = balance + getAccrual();
        System.out.println("Account balance after accrual: " + newBalance);
    }

    public void withdrawMoney() {
        double newBalance = balance - getWriteOff();
        System.out.println("Account balance after withdrawal: " + newBalance);
    }
}