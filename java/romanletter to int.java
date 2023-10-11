import java.util.Scanner;

public class RomanToInteger {
    public static int add(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String input = scanner.nextLine().toUpperCase(); // Convert to uppercase to handle lowercase Roman numerals
        int len = input.length();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            if (i < len - 1 && add(input.charAt(i)) < add(input.charAt(i + 1))) {
                sum += add(input.charAt(i + 1)) - add(input.charAt(i));
                i++; // Skip the next character
            } else {
                sum += add(input.charAt(i));
            }
        }

        System.out.println("Integer value: " + sum);
    }
}
