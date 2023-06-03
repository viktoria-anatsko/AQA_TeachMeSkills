import java.util.Scanner;

public class Main {
    public static Scanner input() {
        return new Scanner(System.in);
    }
    public static void main(String[] args) {
        System.out.println("Enter the document number in the format xxxx-yyy-xxxx-yyy-xyxy" +
                " (where x - number, y - letter). ");
        String documentNumber = input().nextLine();

        DocumentNumber.getDigits(documentNumber);
        System.out.println();
        DocumentNumber.getDocumentNumber(documentNumber);
        System.out.println();
        DocumentNumber.getOnlyLetters(documentNumber);
        DocumentNumber.getLettersToUpperCase(documentNumber);
        System.out.println();
        DocumentNumber.checkOfContainString(documentNumber);
        DocumentNumber.checkSequenceOfNumbers(documentNumber);
        DocumentNumber.checkSubstringForMatch(documentNumber);
    }
}