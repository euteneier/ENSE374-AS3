package Assignment3;

import java.util.Scanner;

public class CreateAccount 
{
	private int choice;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private AccountInfo newAccount;
	private AccountInfo accountToDelete;
	private AccountList listOfAccounts = new AccountList();
	
	
	public CreateAccount()
	{
		firstName = null;
		lastName = null;
		userName = null;
		newAccount = null;
	}
	
	public void addAccount()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter either 1 to add a new account or 2 to delete an account");
		choice = in.nextInt();
		
		while (!(choice == 1 || choice == 2))
		{
			System.out.println("invalid option please try again");
			choice = in.nextInt();
		}
		
		if (choice == 1)
		{
			// the user enters there first name
			System.out.println("please enter your first name");
			firstName = in.nextLine();
			
			// the user enters there last name
			System.out.println("please enter your last name");
			lastName = in.nextLine();
			
			// the user enters a user name
			System.out.println("please enter your user name");
			userName = in.nextLine();
			
			// the user enters a password
			System.out.println("please enter your password");
			password = in.nextLine();
			
			newAccount = new AccountInfo(firstName, lastName, userName, password);
			
			listOfAccounts.addToList(newAccount);
		}
		
		else if (choice == 2)
		{
			System.out.println("enter the information for the account you wish to delete");
			
			// the user enters there first name
			System.out.println("the first name of your account");
			firstName = in.nextLine();
						
			// the user enters there last name
			System.out.println("the last name of your account");
			lastName = in.nextLine();
						
			// the user enters a user name
			System.out.println("the user name of your account");
			userName = in.nextLine();
						
			// the user enters a password
			System.out.println("the password of your account");
			password = in.nextLine();
			
			accountToDelete = new AccountInfo(firstName, lastName, userName, password);
			
			listOfAccounts.removeFromList(accountToDelete);
		}
	}
}


/*
String password;
int digit = 0;
int correctChar = 0;
int correctPassword = 0;
Scanner in = new Scanner(System.in);

System.out.println("Please enter a password: ");
password = in.nextLine();

while(correctPassword != 1)
{
	if(password.length() < 8) // checks to see if the password is 8 characters long
		System.out.println("Incorrect password, the password must contain at least 8 characters");

	for(int i = 0; i < password.length(); i++) // checks for at least 2 digits
	{
		char e = password[i];
	
		if(Character.isDigit(e))
			digit++;
	}
	if(digit < 2)
		System.out.println("Incorrect password, the password must contain atleast 2 digits");

	for(int i = 0; i < password.length(); i++) // checks for only letters and digits
	{
		char c = password[i];
	
		if(Character.isLetter(c) || Character.isDigit(c))
		correctChar++;
	}	
	if(correctChar < 1)
		System.out.println("Incorrecct password, the password must contain only letters and digits");

	if(password.length() >= 8 && digit >= 2 && correctChar >= 1) // if all conditions are met the password is correct
	{															 
		System.out.println("password is correct");
		correctPassword = 1; // program exits the loop
	}
	else
		System.out.print("Please enter a password: ");
		password = in. nextLine();
}
in.close();
*/
