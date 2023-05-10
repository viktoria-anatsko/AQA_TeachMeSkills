import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getMyPersonalData();
        System.out.println();
        transformCharToInt('F');
        System.out.println();
        calculateBodyMassIndex(88, 171);
    }
    public static void getMyPersonalData() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name, please: ");
        String name = input.nextLine();

        System.out.println("Enter your surname, please: ");
        String surname = input.nextLine();

        System.out.println("Enter your age, please: ");
        int age = input.nextInt();

        System.out.println("Enter your height, please: ");
        int height = input.nextInt();

        System.out.println("Enter your weight, please: ");
        double weight = input.nextDouble();

        input.close();

        System.out.println("Name: " + "_" + name);
        System.out.println("Surname: " + "_" + surname);
        System.out.println("Age: " + "_" + age);
        System.out.println("Height: " + "_" + height);
        System.out.println("Weight: " + "_" + weight);
    }

    public static void transformCharToInt(char c) {
        int i = c;
        System.out.println(c + " - " + i);
    }

    public static void calculateBodyMassIndex(double w, int h_cm) {
        double h = (double)h_cm/100;
        double result = w/(h*h);

        BigDecimal result1 = new BigDecimal(result);
        System.out.println("Body Mass Index = " + result1.setScale(1, RoundingMode.HALF_EVEN));
    }
}