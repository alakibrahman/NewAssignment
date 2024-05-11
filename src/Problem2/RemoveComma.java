package Problem2;

import java.util.Scanner;

public class RemoveComma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1000 and 999_999 with a comma: ");

        String input = scanner.nextLine();

        String numberString = input.replace(",", "");

        int number = Integer.parseInt(numberString);

        System.out.println("Numer without comma: " + number);

        scanner.close();
    }
}

