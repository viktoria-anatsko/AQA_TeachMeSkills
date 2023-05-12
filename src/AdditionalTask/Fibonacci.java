package AdditionalTask;

public class Fibonacci {
    public static void main(String[] args) {
        outputFibonacci();
        System.out.println();
    }
    public static void outputFibonacci() {
        System.out.println("Fibonacci sequence: ");
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 1; i < 10; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}
