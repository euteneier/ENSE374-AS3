package MenuAndLogin;

import java.util.Scanner;

public class DeleteAccount 
{
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private Account accountToDelete;
	private AccountList listOfAccounts = new AccountList();
	
	public DeleteAccount()
	{
		firstName = null;
		lastName = null;
		userName = null;
		password = null;
		accountToDelete = null;
		listOfAccounts = null;
	}
	
	public void AccountToDelete()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("please enter the info for the account you wish to delete");
		
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
		
		// sets the account delete info
		accountToDelete = new Account(firstName, lastName, userName, password);

		listOfAccounts.removeFromList(accountToDelete);
		
		in.close();
	}
}
