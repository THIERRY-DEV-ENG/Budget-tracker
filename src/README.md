# 💰 Java Budget Tracker (Console Version)

A simple **console-based Java application** that helps users track their **daily expenses**, calculate **total spending**, and check the **remaining balance** based on a daily budget.

This project is designed for **beginners** to understand **Java fundamentals and OOP (Object-Oriented Programming)** in a clean, real-world way.

---

## 📌 Features

* Set a **daily budget**
* Add **multiple daily expenses**
* Automatically calculates:

    * Total expenses
    * Remaining balance
* Warns if the budget is exceeded
* Clean separation of **logic and execution**

---

## 🧠 Concepts Covered

* Java basics
* Object-Oriented Programming (OOP)

    * Encapsulation
    * Constructors
    * Methods
* Lists (`ArrayList`)
* Loops and conditionals
* User input using `Scanner`

---

## 📁 Project Structure

```
budgettracker/
 ├── BudgetManager.java   // Business logic (OOP)
 └── Main.java            // Main runner (console interaction)
```

---

## 🧩 How It Works

1. User enters a **daily budget**
2. User keeps adding expenses for the day
3. When finished, the program:

    * Sums all expenses
    * Calculates remaining balance
    * Displays a summary

---

## ▶️ How to Run

### 1️⃣ Compile the project

```bash
javac budgettracker/*.java
```

### 2️⃣ Run the application

```bash
java budgettracker.Main
```

---

## 🖥️ Sample Output

```
Enter your daily budget: 1000
Enter expense amount (0 to finish): 200
Enter expense amount (0 to finish): 300
Enter expense amount (0 to finish): 0

===== DAILY BUDGET SUMMARY =====
Daily Budget: 1000
Total Spent: 500
Remaining Balance: 500
✅ You are within your budget.
```

---

## 🎯 Learning Purpose

This project helps you understand:

* How **real applications separate logic from execution**
* How to design **clean, maintainable Java code**
* How to apply OOP concepts in practical scenarios

It is a strong foundation before moving to:

* GUI applications (Swing / JavaFX)
* File handling
* Databases
* Enterprise Java projects

---

## 🚀 Future Improvements

* Save expenses to a file
* Monthly or yearly budget tracking
* Expense categories
* GUI version (Swing / JavaFX)
* Database integration

---

## 👨‍💻 Author

Built as a **learning-focused Java project** to strengthen programming fundamentals a
