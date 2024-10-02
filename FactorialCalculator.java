import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            int num = 0;

            // Input Validation with Try Catch 
            while (true) {
                try {
                    System.out.println("Enter a positive integer: ");
                    num = scanner.nextInt();
                    if (num < 0) {
                        System.out.println("Factorial is not defined for negative numbers. Please enter a positive integer.");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next(); // Clear the invalid input
                }
            }

            // Calculate factorial
            long factorial = calculateFactorial(num);
            System.out.println("The factorial of " + num + " is " + factorial);

            // Ask the user if they want to continue
            System.out.println("Do you want to calculate another factorial? (yes/no): ");
            String response = scanner.next().toLowerCase();
            if (!response.equals("yes")) {
                continueProgram = false;
            }
        }

        System.out.println("Program terminated. Goodbye!");
        scanner.close();
    }

    public static long calculateFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
