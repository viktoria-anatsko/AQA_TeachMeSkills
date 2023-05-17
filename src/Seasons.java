public class Seasons {
    public static void main(String[] args) {
        getNameOfMonth1(11);
        getNameOfMonth2(6);
    }
    public static void getNameOfMonth1(int number) {
        switch (number) {
            case 1:
            case 2: System.out.println("This is a winter."); break;
            case 3:
            case 4:
            case 5: System.out.println("This is a spring."); break;
            case 6:
            case 7:
            case 8: System.out.println("This is a summer."); break;
            case 9:
            case 10:
            case 11: System.out.println("This is an autumn."); break;
            case 12: System.out.println("This is a winter."); break;
            default: System.out.println("Accepted numbers from 1 to 12."); break;
        }
    }
    public static void getNameOfMonth2(int n) {
        if(n == 1 || n  == 2 || n == 12) {
            System.out.println("This is a winter.");
        } else if(n == 3 || n == 4 || n == 5) {
            System.out.println("This is a spring.");
        } else if (n == 6 || n == 7 || n == 8) {
            System.out.println("This is a summer.");
        } else if (n == 9 || n == 10 || n == 11) {
            System.out.println("This is an autumn.");
        } else
            System.out.println("Accepted numbers from 1 to 12.");
    }
}
