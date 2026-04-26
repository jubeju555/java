import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTrackerProject {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            printMenu();
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addExpense(scanner, expenses);
                    break;
                case 2:
                    listExpenses(expenses);
                    break;
                case 3:
                    showTotal(expenses);
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n=== Expense Tracker ===");
        System.out.println("1) Add expense");
        System.out.println("2) List expenses");
        System.out.println("3) Show total");
        System.out.println("4) Exit");
    }

    private static void addExpense(Scanner scanner, ArrayList<Double> expenses) {
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Amount cannot be negative.");
            return;
        }
        expenses.add(amount);
        System.out.println("Expense added.");
    }

    private static void listExpenses(ArrayList<Double> expenses) {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }

        System.out.println("Expenses:");
        for (int i = 0; i < expenses.size(); i++) {
            System.out.printf("%d) %.2f%n", i + 1, expenses.get(i));
        }
    }

    private static void showTotal(ArrayList<Double> expenses) {
        double total = 0.0;
        for (double expense : expenses) {
            total += expense;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
