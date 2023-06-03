
public class DocumentNumber {
    public static void getDigits(String documentNumber) {
        String[] parts = documentNumber.split("-");
        System.out.print(parts[0] + " " + parts[2]);
        }

    public static void getDocumentNumber(String documentNumber) {
        String[] parts = documentNumber.split("-");
        parts[1] = "***";
        parts[3] = "***";
        documentNumber = String.join("-", parts);
        System.out.println(documentNumber);
    }

    public static void getOnlyLetters(String documentNumber) {
        String[] parts = documentNumber.split("-");
        char[] elements = parts[4].toCharArray();
        elements[0] = '/';
        elements[2] = '/';
        parts[4] = String.valueOf(elements);
        String newString = String.join("/", parts[1], parts[3]);
        System.out.println("Letters:" + newString.toLowerCase() + parts[4].toLowerCase());
    }

    public static void getLettersToUpperCase(String documentNumber) {
        StringBuilder document = new StringBuilder(documentNumber);
        document.delete(0, 5);
        document.delete(3, 8);
        document.replace(3,4, "/");
        document.delete(7, 8);
        document.replace(7, 8, "/");
        document.replace(9, 10, "/");
        String newString = document.toString();
        System.out.println("Letters:" + newString.toUpperCase());
    }

    public static void checkOfContainString(String documentNumber) {
        if (documentNumber.contains("abc") || documentNumber.contains("ABC")) {
            System.out.println("The name of the document contains 'abc' or 'ABC'.");
        } else {
            System.out.println("The name of the document doesn't contain 'abc' or 'ABC'.");
        }
    }

    public static void checkSequenceOfNumbers(String documentNumber) {
        if (documentNumber.startsWith("555")) {
            System.out.println("The name of the document starts with '555'.");
        } else {
            System.out.println("The name of the document doesn't start with '555'.");
        }
    }

    public static void checkSubstringForMatch(String documentNumber) {
        if (documentNumber.endsWith("1a2b")) {
            System.out.println("The name of the document contains '1a2b' at the end.");
        } else {
            System.out.println("The name of the document doesn't contain '1a2b' at the end.");
        }
    }
}
