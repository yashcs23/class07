import java.util.Scanner;

public class program {
    public static int getNumberFromUser(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int number = scanner.nextInt();
        return number;
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static int divideNumbers(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;  
        }
        return a / b;
    }

    public static void displayResult(int result) {
        System.out.println("Sum: " + result);
    }

    public static void displayDivisionResult(int result) {
        System.out.println("Quotient: " + result);
    }

    public static void main(String[] args) {
        int num1 = getNumberFromUser("Enter first number: ");
        int num2 = getNumberFromUser("Enter second number: ");

        int sum = addNumbers(num1, num2);
        displayResult(sum);

        int quotient = divideNumbers(num1, num2);
        displayDivisionResult(quotient);
    }
}
