import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input text: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive check

        boolean[] alphabetOccurrence = new boolean[26];

        // Initialize the array to all false
        for (int i = 0; i < 26; i++) {
            alphabetOccurrence[i] = false;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                alphabetOccurrence[index] = true;
            }
        }

        boolean isPangram = true;
        for (boolean occurrence : alphabetOccurrence) {
            if (!occurrence) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("It's a pangram.");
        } else {
            System.out.println("It's not a pangram.");
        }
    }
}
