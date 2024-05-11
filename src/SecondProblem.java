import java.util.Scanner;

public class SecondProblem {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
         double number = scanner.nextDouble();

         double square = number * number;
         double cube = number * square;
         double forthPower = Math.pow(number , 4);

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Forth Power: " + forthPower);

        scanner.close();
    }
}
