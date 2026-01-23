monthly_income: int
rent: int
food_cost: int
transport_cost: int
total_expenses: int
money_left: int
spend_ratio: int

monthly_income = int(input("Enter your monthly income: "))
rent = int(input("Enter your rent: "))
food_cost = int(input("Enter your food cost: "))
transport_cost = int(input("Enter your transportation cost: "))

total_expenses = rent + food_cost + transport_cost
money_left = monthly_income - total_expenses
spend_ratio = (total_expenses / monthly_income) * 100

print(f"Total expenses: ${total_expenses}")
print(f"Money left over: ${money_left}")
print(f"You spent {spend_ratio}% of your income.")
