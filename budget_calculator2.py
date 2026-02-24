income = float(input("Enter your monthly income: \n> $"))
rent = float(input("Enter your rent: \n> $"))
food = float(input("Enter your food cost: \n> $"))
transportation = float(input("Enter your transportation cost: \n> $"))
entertainment = float(input("Enter your entertainment cost: \n> $"))

# Validate that no negative values were entered
if (income < 0 or rent < 0 or food < 0 or transportation < 0
    or entertainment < 0):
    print("One or more amounts entered were negative. \n"
          + "Please restart the program and try again.")
else:
    # Ask the user if they want a summary
    summaryY = "y"
    summary = input("\nWould you like a summary (y/n)? ")

    # If the user wants a summary, print all details
    if summary == summaryY:
        print(f"\nMonthly Income: {income:-10.2f}")
        print(f"\nRent: {rent:-20.2f}")
        print(f"Food: {food:-20.2f}")
        print(f"Transportation: {transportation:-10.2f}")
        print(f"Entertainment: {entertainment:-11.2f}")

        # Perform calculations
        total_expenses = rent + food + transportation + entertainment
        money_left = income - total_expenses
        percent_income = (total_expenses / income) * 100

        # Display results
        print(f"\nTotal Expenses: {total_expenses:-10.2f}")
        print(f"Money Left: {money_left:-14.2f}")
        print(f"\nPercent of income spent: {percent_income:.2f}%")

        # Determine spending category based on percent of income spent
        if percent_income >= 0 and percent_income <= 49:
            category = 1
        elif percent_income >= 50 and percent_income <= 74:
            category = 2
        elif percent_income >= 75 and percent_income <= 99:
            category = 3
        else:
            assert percent_income > 100
            category = 4

        # Display message based on spending category
        match category:
            case 1:
                print("\nYou are spending a low portion of your income.")
                print("Thank you for using the Budget Calculator :)")
            case 2:
                print("\nYou are spending a moderate portion of your income.")
                print("Thank you for using the Budget Calculator :)")
            case 3:
                print("\nYou are spending a high portion of your income.")
                print("Thank you for using the Budget Calculator :)")
            case 4:
                print("\nOk, I think you're overspending.")
                print("Thank you for using the Budget Calculator :)")
            case _:
                print("You must've done something wrong becuase this should never happen.")
                print("Please restart the program and try again.")
    else:
        # If user does not want a summary
        print("Thank you for using the Budget Calculator :)")
