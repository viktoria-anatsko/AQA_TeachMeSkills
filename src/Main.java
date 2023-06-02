import java.util.Scanner;

// Tic-tac-toe
public class Main {

    public static void main(String[] args) {
        playGame();

    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static void playGame() {
        boolean gameOver = false;

        String[][] array = new String[][]{
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        System.out.println("Hello. Let's play Tic-tac-toe.");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        while (!gameOver) {
            System.out.println("Where do you want to go? Enter cell number from 1 to 9.");
            String step = input().nextLine();
            String str = null;
            int random = (int) (Math.random() * 10);

            if (random >= 0) {
                int step2 = random;
                str = Integer.toString(step2);
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j].equals(step)) {
                        array[i][j] = "X";
                    } else if (array[i][j] != "X" && array[i][j].equals(str)) {
                        array[i][j] = "O";
                    }
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }


//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array[i].length; j++) {
//                if (array[i][0] != array[i][j] && array[i][0] == array[i][1] && array[i][0] == array[i][2]) {
//                    gameOver = true;
//                    return;
//                }
//                if (array[0][j] != array[i][j] && array[0][j] == array[1][j] && array[0][j] == array[2][j]) {
//                    gameOver = true;
//                    return;
//                }
//                if (array[0][0] != array[i][j] && array[0][0] == array[1][1] && array[0][0] == array[2][2]) {
//                    gameOver = true;
//                    return;
//                }
//                if (array[0][2] != array[i][j] && array[0][2] == array[1][1] && array[0][2] == array[2][0]) {
//                    gameOver = true;
//                    return;
//                }
//                }
//            }
//
        }
        //System.out.println("Game over!");
    }

    
}