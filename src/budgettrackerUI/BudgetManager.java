package budgettrackerUI;

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

    public double getDailyBudget() {
        return dailyBudget;
    }
}
