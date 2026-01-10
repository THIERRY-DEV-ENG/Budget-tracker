package Budgettracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your daily budget: ");
        double budget = scanner.nextDouble();

        BudgetManager manager = new BudgetManager(budget);

        while (true) {
            System.out.print("Enter expense amount (0 to finish): ");
            double expense = scanner.nextDouble();

            if (expense == 0) {
                break;
            }

            manager.addExpense(expense);
        }

        manager.showSummary();
        scanner.close();
    }
}
