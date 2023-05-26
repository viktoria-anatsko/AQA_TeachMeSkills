import java.util.Scanner;

// Tick-tack-toe
public class Main {

    public static void main(String[] args) {
        startGame();
        //getRandomStep();

    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static void startGame() {
        String[][] array = new String[][]{
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        System.out.println("Hello. Let's play Tick-tack-toe.");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

            System.out.println("Where do you want to go? Enter cell number from 1 to 9.");
            String step = input().nextLine();


            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j].equals(step)) {
                        array[i][j] = "X";
                    }
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }

//    public static void getRandomStep() {
//    int random = (int)(Math.random()*10);
//    int step2;
//
//    if (random > 0) {
//        step2 = random;
//    }
//    }



}