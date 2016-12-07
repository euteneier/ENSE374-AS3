package Assignment3;

import java.util.Scanner;

public class CreateAccount 
{
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private Account newAccount;
	private AccountList listOfAccounts = new AccountList();
	
	public CreateAccount()
	{
		firstName = null;
		lastName = null;
		userName = null;
		password = null;
		newAccount = null;
		listOfAccounts = null;
	}
	
	public Account addAccount()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("please enter the information for the new account");
		
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
		
		// sets the new account info
		newAccount = new Account(firstName, lastName, userName, password);
		
		//listOfAccounts.addToList(newAccount);
		
		in.close();
		
		return newAccount;
	}
}
