package Employees;

public class MyMain {
    public static void main(String[] args) {
        getInformation();
    }

    public static void getInformation() {
        Director employee1 = new Director();
        employee1.getPositionName();

        Worker employee2 = new Worker();
        employee2.getPositionName();

        Accountant employee3 = new Accountant();
        employee3.getPositionName();
    }
}
