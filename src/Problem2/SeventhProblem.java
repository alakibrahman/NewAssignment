package Problem2;

import java.util.Scanner;

public class SeventhProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");

        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");

        double width = scanner.nextDouble();

        double area = length * width;

        double perimeter = 2 * (length + width);

        double diagonal = Math.sqrt((length * length) + (width * width));

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Diagonal of the rectangle: " + diagonal);

        scanner.close();
    }

}
