package account;

import java.util.Scanner;

public class Login 
{
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private AccountInfo login;
	private AccountList listOfAccounts;

	
	public Login()
	{
		firstName = null;
		lastName = null;
		userName = null;
		password = null;
		listOfAccounts = null;
	}
	
	public void loginToAccount()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter the information for the account you wish to login to");
		
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
		
		login = new AccountInfo(firstName, lastName, userName, password);
		
		listOfAccounts.login(login);
		
		in.close();
	}
}
