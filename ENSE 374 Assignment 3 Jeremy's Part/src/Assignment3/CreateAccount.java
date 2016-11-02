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
