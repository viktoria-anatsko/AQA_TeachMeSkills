package Phone;

import Phone.Phone;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("37529 648 12 40", "Samsung Galaxy S20", 186);
        Phone phone2 = new Phone("37544 126 33 75", "Xiaomi Redmi Note 11", 179);
        Phone phone3 = new Phone("37533 754 30 98", "IPhone 12", 165);

        phone1.getInfo();
        phone1.receiveCall("Peter");
        phone1.receiveCall("Sam", "37529 578 00 12");
        System.out.println();

        phone2.getInfo();
        phone2.receiveCall("Ann");
        phone1.receiveCall("NicK", "37533 867 39 55");
        System.out.println();

        phone3.getInfo();
        phone3.receiveCall("Stiven");
        phone1.receiveCall("Sveta", "37544 780 22 34");
        System.out.println();

        phone3.sendMessage("37544 780 22 34", "37529 556 31 70", "37544 865 49 12", "37533 321 80 02");
    }
}