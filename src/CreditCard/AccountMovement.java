package CreditCard;

public class AccountMovement {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("1456 7388 9052 1659", "Tatiana Petrova", 2370.5);
        CreditCard card2 = new CreditCard("6194 3807 1516 0284", "Dmitry Savin", 4236.9);
        CreditCard card3 = new CreditCard("5890 0000 2391 1365", "Oleg Daynich", 1347.45);

        card1.getCardInfo();
        card1.addMoney();
        System.out.println();

        card2.getCardInfo();
        card2.addMoney();
        System.out.println();

        card3.getCardInfo();
        card3.withdrawMoney();
    }
}
