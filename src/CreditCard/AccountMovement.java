package CreditCard;

public class AccountMovement {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("1456 7388 9052 1659", 2370.5);
        CreditCard card2 = new CreditCard("6194 3807 1516 0284", 4236.9);
        CreditCard card3 = new CreditCard("5890 0000 2391 1365", 1347.45);

        card1.getCardInfo();
        card1.setAccrual(1988.2);
        card1.addMoney();
        System.out.println();

        card2.getCardInfo();
        card2.setAccrual(3400);
        card2.addMoney();
        System.out.println();

        card3.getCardInfo();
        card3.setWriteOff(276.8);
        card3.withdrawMoney();
    }
}
