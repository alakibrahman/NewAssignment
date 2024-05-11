package Problem2;

import java.util.Scanner;

public class ThirdProblem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");

        int firstNumber = scanner.nextInt();

        System.out.print(" Enter the second integer: ");

        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;

        int difference = firstNumber - secondNumber;

        int product = firstNumber * secondNumber;

        double average = sum / 2.0;

        int distance = Math.abs(difference);

        int max = Math.max(firstNumber , secondNumber);

        int min = Math.min(firstNumber , secondNumber);

        System.out.println("The sum: " + sum);

        System.out.println("The difference: " + difference);

        System.out.println("The product: " + product);

        System.out.println("The average: " + average);

        System.out.println("The distance(absolute value of the difference): " + distance);

        System.out.println("The maximum: " + max);

        System.out.println("The minimum: " + min);

        scanner.close();
    }
}
