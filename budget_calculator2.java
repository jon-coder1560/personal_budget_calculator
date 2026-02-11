/* 
* This is an updated version of the previous budget calculator which 
* implements the use of if/then/else, switch, and boolean variables
* Will be finished between 2/13 and 2/18
* 
* @author Jonathan
*/

import java.util.Scanner;

public class BudgetCalculator2 {
  public static void main(String[] args) {
    // Declare variables
    Scanner budget;
		double monthlyIncome;
		double rent;
		double foodCost;
		double transportCost;
		int savingsGoal;
		String summaryReport;
		double totalExpenses;
		double moneyLeft;
		double spendRatio;
    
    budget = new Scanner(System.in);
		System.out.print("Enter your monthly income: $");
		monthlyIncome = budget.nextDouble();
		
		System.out.print("Enter your rent: $");
		rent = budget.nextDouble();
		
		System.out.print("Enter your food cost: $");
		foodCost = budget.nextDouble();
		
		System.out.print("Enter your transportation cost: $");
		transportCost = budget.nextDouble();
		
		System.out.print("\nEnter your saving goal percentage (0-100): ");
		savingsGoal = budget.nextInt();
		
		System.out.print("Would you like a summary report (yes/no)? ".toLowerCase());
		budget.nextLine();
		summaryReport = budget.nextLine();
		if (summaryReport.equalsIgnoreCase("yes")) {
			System.out.println("\n--------------------------------------");
			System.out.printf("%25s\n", "Budget Summary");
			System.out.println("--------------------------------------");
			
			System.out.printf("%-20s %f\n", "Total monthly income: ", monthlyIncome);
			
			totalExpenses = rent + foodCost + transportCost;
			System.out.printf("%-20s %f\n", "Total expenses: ", totalExpenses);
			moneyLeft = monthlyIncome - totalExpenses;
			System.out.printf("%-20s %f\n", "Total monthly income: ", moneyLeft);
			
			spendRatio = (totalExpenses/ monthlyIncome) * 100;
			System.out.printf("%-20s %f\n", "Percentage of income spent: ", spendRatio);
			System.out.printf("%-20s %f\n", "recommended savings amount: ", monthlyIncome);
			System.out.printf("%-20s %f\n", "Daily spending average: ", monthlyIncome);
		} else {
			System.out.printf("\n%s %s\n", "You typed ", summaryReport);
		}
		
		
		budget.close();
  }
}
