package Problem2;

import java.util.Scanner;

public class NinethProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of gallons of gas in the tank: ");

        double gallonInTank = scanner.nextDouble();

        System.out.print("Enter the fuel efficiency in miles per gallon: ");

        double fuelEfficiency = scanner.nextDouble();

        System.out.print("Enter the price of gas per gallon: ");

        double gasPrice = scanner.nextDouble();

        double distance = gallonInTank + fuelEfficiency;

        double tripCost = gallonInTank + fuelEfficiency;

        System.out.println("The distance that can be travelled is: " + distance);

        System.out.println("The cost of the trip will be: $" + tripCost);

        scanner.close();
    }
}
