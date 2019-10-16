import java.util.Scanner;

public class MiddleCharacters {

    public static void printMiddleCharactersFromString (String input) {
        if (input.length() % 2 == 1) {
            int currentChar = input.length() / 2;
            System.out.println(input.charAt(currentChar));
        }

        if (input.length() % 2 == 0) {
            int currentChar = input.length() / 2;
            System.out.println(input.charAt(currentChar - 1) + "" + input.charAt(currentChar));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharactersFromString(input);
    }
}
