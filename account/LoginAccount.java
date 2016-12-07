package Assignment3;

import java.util.Scanner;

public class LoginAccount 
{
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private Account accountCompare;
	private AccountList listOfAccounts = new AccountList();
	
	public LoginAccount()
	{
		firstName = null;
		lastName = null;
		userName = null;
		password = null;
		accountCompare = null;
		listOfAccounts = null;
	}
	
	public Account loginToAccount()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("please enter the info for the account you wish to login to");
		
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
		
		// sets the account compare info
		accountCompare = new Account(firstName, lastName, userName, password);
		
		//listOfAccounts.login(accountCompare);
		
		in.close();
		
		return accountCompare;
	}
}
