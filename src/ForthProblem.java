public class ForthProblem {
    public static void main(String[] args) {

        int firstNumber = 25;
        int secondNumber = 20;

        int sum = firstNumber + secondNumber;

        int difference = firstNumber - secondNumber;

        int product = firstNumber * secondNumber;

        double average = sum / 2.0;

        int distance = Math.abs(difference);

        int max = Math.max(firstNumber, secondNumber);

        int min = Math.min(firstNumber, secondNumber);

        System.out.println("The sum: " + sum);

        System.out.println("The difference" + difference);

        System.out.println("The product: " + product);

        System.out.println("The average: " + average);

        System.out.println("The maximum (the larger of the two): " + max);

        System.out.println("The minimum (the smaller of the two): " + min);
    }
}
