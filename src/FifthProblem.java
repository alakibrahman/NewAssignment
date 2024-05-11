import java.util.Scanner;

public class FifthProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meter = scanner.nextInt();

        double meter_to_miles = meter * 0.000621371;

        double meter_to_feets = meter * 3.28084;

       double meter_to_inches = meter * 39.3701;

        System.out.println("Meter to Miles: " + meter_to_miles);

        System.out.println("Meter to Feets: " + meter_to_feets);

        System.out.println("Meter to Inches: " + meter_to_inches);

        scanner.close();

    }
}
