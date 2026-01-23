import java.util.Scanner;

/**
 * Personal Budget Calculator
 * 
 * This program asks the user for their monthly income and several expense
 * amounts. It then calculates the total expenses, the remaining balance,
 * and the percentage of income that was spent. The purpose of this program
 * is to demonstrate basic input, processing, and output in Java using
 * variables, arithmetic operations, and the Scanner class.
 * 
 * @author Jonathan
 */


public class PersonalBudgetCalculator {

	public static void main(String[] args) {
		
		Scanner stdin;
		double monthlyIncome;
		double rent;
		double foodCost;
		double transportCost;
		double totalExpenses;
		double moneyLeft;
		double spendRatio;
		
		// Ask the user for income and expense amounts.
		stdin = new Scanner(System.in);
		System.out.print("Enter your monthly income: ");
		monthlyIncome = stdin.nextDouble();
		
		System.out.print("Enter your rent: ");
		rent = stdin.nextDouble();
		
		System.out.print("Enter your food cost: ");
		foodCost = stdin.nextDouble();
		
		System.out.print("Enter your transportation cost: ");
		transportCost = stdin.nextDouble();
		stdin.close();
		
		// Add all expenses together to get the total.
		// Subtract total expenses from income to find the remaining balance.
		// Divide expenses by income and multiply by 100 to get the percent spent.
		totalExpenses = rent + foodCost + transportCost;
		moneyLeft = monthlyIncome - totalExpenses;
		spendRatio = (totalExpenses / monthlyIncome) * 100;
		
		// Display the total expenses, remaining balance, and percent of income spent to the user.
		System.out.println("Total expenses: $" + totalExpenses);
		System.out.println("Money left over: $" + moneyLeft);
		System.out.println("You spent " + spendRatio + " of you income.");
		
		

	}

}
