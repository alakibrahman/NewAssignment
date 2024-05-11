package Problem2;

import java.util.Scanner;

public class SixthProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");

        double radius = scanner.nextDouble();

        double circleArea = Math.PI * radius * radius;

        double circleCircumference = 2 * Math.PI * radius;

        System.out.println("Area: " + circleArea);

        System.out.println("Circumference: " + circleCircumference);

        double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius , 3);

        double sphereSurfaceArea = 4 * Math.PI * radius * radius;

        System.out.println("\nVolume: " + sphereVolume);

        System.out.println("Surface Area: " + sphereSurfaceArea);

        scanner.close();

    }

}
