import java.util.Scanner;

public class CalculatorProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println("=== Simple Calculator ===");
            System.out.print("Enter first number: ");
            double first = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            String operator = scanner.next();

            System.out.print("Enter second number: ");
            double second = scanner.nextDouble();

            Double result = calculate(first, second, operator);

            if (result == null) {
                System.out.println("Invalid operation.");
            } else {
                System.out.println("Result: " + result);
            }

            System.out.print("Do another calculation? (y/n): ");
            String again = scanner.next();
            if (!again.equalsIgnoreCase("y")) {
                break;
            }
        }

        scanner.close();

    }

    private static Double calculate(double first, double second, String operator) {
        switch (operator) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                if (second == 0) {
                    System.out.println("Cannot divide by zero.");
                    return null;
                }
                return first / second;
            case "%":
                return first % second;
            default:
                return null;
        }
    }
}
