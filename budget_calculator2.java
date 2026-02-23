import java.util.Scanner;

/*
 * The BudgetCalculator2 class provides a simple console-based budgeting tool
 * that collects a user's monthly income and expenses, calculates total spending,
 * determines how much money remains, and categorizes the user's spending habits.
 *
 * The program performs the following tasks:
 *   Prompts the user for income and four expense categories
 *   Validates that no negative values are entered
 *   Optionally displays a detailed summary of all financial inputs
 *   Calculates total expenses, remaining money, and percent of income spent
 *   Classifies spending into one of four categories (low → overspending)
 * 
 * @author Jonathan
 * 
 * 2/23/26
 */

public class BudgetCalculator2 {
    
    public static void main (String[] args) {
        
        // Create a Scanner object to read user input
        Scanner budget;
        
        // Declare variables for income and expenses
        double monthlyIncome;
        double rent;
        double food;
        double transportation;
        double entertainment;
        
        // Variables for calculations
        double totalExpenses;
        double moneyLeft;
        double percentIncome;
        
        // Variables for summary option and spending category
        String summary;
        String summaryY = "y";
        int category;
        
        budget = new Scanner(System.in);

        // Collect monthly income
        System.out.print("Enter your monthly income: \n> $");
        monthlyIncome = budget.nextDouble();
        
        // Collect rent cost
        System.out.print("Enter your rent: \n> $");
        rent = budget.nextDouble();
        
        // Collect food cost
        System.out.print("Enter your food cost: \n> $");
        food = budget.nextDouble();
        
        // Collect transportation cost
        System.out.print("Enter your transportation cost: \n> $");
        transportation = budget.nextDouble();
        
        // Collect entertainment cost
        System.out.print("Enter your entertainment cost: \n> $");
        entertainment = budget.nextDouble();
        
        // Validate that no negative values were entered
        if (monthlyIncome < 0 || rent < 0 || food < 0 || 
                transportation < 0 || entertainment < 0) {
            
            System.out.print("One or more amounts entered were negative. \n"
                    + "Please restart the program and try again.");
        
        } else {
            
            // Ask user if they want a summary
            System.out.print("\nWould you like a summary (y/n)? ");
            budget.nextLine(); // Clear leftover newline
            summary = budget.nextLine();
            
            // If user wants a summary, print all details
            if (summary.equalsIgnoreCase(summaryY)) {
                
                // Display income and expenses
                System.out.printf("\n%-20s%.2f\n", "Monthly Income:", monthlyIncome);
                System.out.printf("\n%-20s%.2f\n", "Rent:", rent);
                System.out.printf("%-20s%.2f\n", "Food:", food);
                System.out.printf("%-20s%.2f\n", "Transportation:", transportation);
                System.out.printf("%-20s%.2f\n", "Entertainment:", entertainment);
                
                // Perform calculations
                totalExpenses = rent + food + transportation + entertainment;
                moneyLeft = monthlyIncome - totalExpenses;
                percentIncome = (totalExpenses / monthlyIncome) * 100;
                
                // Display results
                System.out.printf("\n%-20s%.2f\n", "Total expenses:", totalExpenses);
                System.out.printf("%-20s%.2f\n", "Money Left:", moneyLeft);
                System.out.printf("\n%-20s %.2f%s\n", "Percent of income spent:", 
                        percentIncome, "%");
                
                // Determine spending category based on percent of income spent
                if (percentIncome >= 0 && percentIncome <= 49) {
                    category = 1;
                } else if (percentIncome >= 50 && percentIncome <= 74) {
                    category = 2;
                } else if (percentIncome >= 75 && percentIncome <= 99) {
                    category = 3;
                } else {
                    // Over 100% means overspending
                    assert percentIncome > 100;
                    category = 4;
                }
                
                // Display message based on spending category
                switch (category) {
                    case 1:
                        System.out.println("\nYou are spending a low portion of your income.");
                        System.out.println("Thank you for using the Budget Calculator :)");
                        break;
                    case 2:
                        System.out.println("\nYou are spending a moderate portion of your income.");
                        System.out.println("Thank you for using the Budget Calculator :)");
                        break;
                    case 3:
                        System.out.println("\nYou are spending a high portion of your income.");
                        System.out.println("Thank you for using the Budget Calculator :)");
                        break;
                    case 4:
                        System.out.println("\nOk, I think you're overspending.");
                        System.out.println("Thank you for using the Budget Calculator :)");
                    default:
                        break;
                }
                
            } else {
                // If user does not want a summary
                assert summary != summaryY;
                System.out.println("Thank you for using the Budget Calculator :)");
            }
        }
        
        // Close the Scanner to prevent resource leaks
        budget.close();
    }
}
