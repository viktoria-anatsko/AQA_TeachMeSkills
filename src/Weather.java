import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        getWeatherForecast();
    }

    public static Scanner enterData() {
        return new Scanner(System.in);
    }

    public static void getWeatherForecast() {
        System.out.print("Enter temperature: ");
        int t = enterData().nextInt();

        if (t > -5) {
            System.out.println("Warm");
        } else if (t <= -5 && t > -20) {
            System.out.println("Normal");
        } else if (t <= -20) {
            System.out.println("Cold");
        }
    }
}
