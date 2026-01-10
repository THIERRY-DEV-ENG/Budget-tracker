package Budgettracker;

import java.util.ArrayList;
import java.util.List;

public class BudgetManager {

    private double dailyBudget;
    private List<Double> expenses;


    public BudgetManager(double dailyBudget) {
        this.dailyBudget = dailyBudget;
        this.expenses = new ArrayList<>();
    }


    public void addExpense(double amount) {
        if (amount > 0) {
            expenses.add(amount);
        }
    }
    public double getTotalExpenses() {
        double total = 0;
        for (double e : expenses) {
            total += e;
        }
        return total;
    }

    public double getRemainingBalance() {
        return dailyBudget - getTotalExpenses();
    }


    public void showSummary() {
        System.out.println("\n===== DAILY BUDGET SUMMARY =====");
        System.out.println("Daily Budget: " + dailyBudget);
        System.out.println("Total Spent: " + getTotalExpenses());
        System.out.println("Remaining Balance: " + getRemainingBalance());

        if (getRemainingBalance() < 0) {
            System.out.println(" You exceeded your budget!");
        } else {
            System.out.println("You are within your budget.");
        }
    }
}
