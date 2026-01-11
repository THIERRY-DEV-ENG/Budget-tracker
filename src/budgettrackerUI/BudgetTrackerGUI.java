package budgettrackerUI;

import javax.swing.*;
import java.awt.*;

public class BudgetTrackerGUI extends JFrame {

    private BudgetManager manager;

    private JTextField budgetField;
    private JTextField expenseField;
    private JTextArea outputArea;

    public BudgetTrackerGUI() {
        setTitle("Daily Budget Tracker");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // TOP PANEL (Budget Input)
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2, 2, 5, 5));

        topPanel.add(new JLabel("Daily Budget:"));
        budgetField = new JTextField();
        topPanel.add(budgetField);

        JButton setBudgetBtn = new JButton("Set Budget");
        topPanel.add(setBudgetBtn);

        add(topPanel, BorderLayout.NORTH);

        // CENTER PANEL (Expense Input)
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 2, 5, 5));

        centerPanel.add(new JLabel("Expense Amount:"));
        expenseField = new JTextField();
        centerPanel.add(expenseField);

        JButton addExpenseBtn = new JButton("Add Expense");
        centerPanel.add(addExpenseBtn);

        add(centerPanel, BorderLayout.CENTER);

        // BOTTOM PANEL (Output)
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.SOUTH);

        // BUTTON LOGIC
        setBudgetBtn.addActionListener(e -> {
            try {
                double budget = Double.parseDouble(budgetField.getText());
                manager = new BudgetManager(budget);
                outputArea.setText("Budget set to: " + budget + "\n");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter a valid budget");
            }
        });

        addExpenseBtn.addActionListener(e -> {
            if (manager == null) {
                JOptionPane.showMessageDialog(this, "Set budget first!");
                return;
            }

            try {
                double expense = Double.parseDouble(expenseField.getText());
                manager.addExpense(expense);

                outputArea.setText(
                        "Daily Budget: " + manager.getDailyBudget() + "\n" +
                                "Total Spent: " + manager.getTotalExpenses() + "\n" +
                                "Remaining: " + manager.getRemainingBalance()
                );

                expenseField.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter a valid expense");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BudgetTrackerGUI().setVisible(true);
        });
    }
}
