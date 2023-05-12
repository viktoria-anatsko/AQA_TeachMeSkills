public class Seasons {
    public static void main(String[] args) {
        getNameOfMonth1(5);
        getNameOfMonth2(11);
    }
    public static void getNameOfMonth1(int number) {
        switch (number) {
            case 1: System.out.println("The first month is January."); break;
            case 2: System.out.println("The second month is February."); break;
            case 3: System.out.println("The third month is March."); break;
            case 4: System.out.println("The fourth month is April."); break;
            case 5: System.out.println("The fifth month is May."); break;
            case 6: System.out.println("The sixth month is June."); break;
            case 7: System.out.println("The seventh month is July."); break;
            case 8: System.out.println("The eighth month is August."); break;
            case 9: System.out.println("The ninth month is September."); break;
            case 10: System.out.println("The tenth month is October."); break;
            case 11: System.out.println("The eleventh month is November."); break;
            case 12: System.out.println("The twelfth month is December."); break;
            default: System.out.println("Accepted numbers from 1 to 12."); break;
        }
    }
    public static void getNameOfMonth2(int n) {
        if(n == 1) {
            System.out.println("The first month is January.");
        } else if(n == 2) {
            System.out.println("The second month is February.");
        } else if (n == 3) {
            System.out.println("The third month is March.");
        } else if (n == 4) {
            System.out.println("The fourth month is April.");
        } else if (n == 5) {
            System.out.println("The fifth month is May.");
        } else if (n == 6) {
            System.out.println("The sixth month is June.");
        } else if (n == 7) {
            System.out.println("The seventh month is July.");
        } else if (n == 8) {
            System.out.println("The eighth month is August.");
        } else if (n == 9) {
            System.out.println("The ninth month is September.");
        } else if (n == 10) {
            System.out.println("The tenth month is October.");
        } else if (n == 11) {
            System.out.println("The eleventh month is November.");
        } else if (n == 12) {
            System.out.println("The twelfth month is December.");
        } else
            System.out.println("Accepted numbers from 1 to 12.");
    }
}
