import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        determinateColor();
    }
    public static Scanner enterData() {
        return new Scanner(System.in);
    }
    public static void determinateColor() {
        System.out.println("Enter number from 1 to 7: ");
        int numOfColor = enterData().nextInt();

        switch (numOfColor) {
            case 1:
                System.out.println("The " + numOfColor + " color of rainbow is red."); break;
            case 2:
                System.out.println("The " + numOfColor + " color of rainbow is orange."); break;
            case 3:
                System.out.println("The " + numOfColor + " color of rainbow is yellow."); break;
            case 4:
                System.out.println("The " + numOfColor + " color of rainbow is green."); break;
            case 5:
                System.out.println("The " + numOfColor + " color of rainbow is blue."); break;
            case 6:
                System.out.println("The " + numOfColor + " color of rainbow is indigo."); break;
            case 7:
                System.out.println("The " + numOfColor + " color of rainbow is violet."); break;
            default:
                System.out.println("You need to enter number from 1 to 7."); break;
        }
    }
}
