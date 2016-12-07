package Assignment3;

import java.util.LinkedList;

public class AccountList 
{
	private LinkedList<Account> accountList = new LinkedList<Account>();
	private Account openMenu = new Account();
	
	public AccountList()
	{
		accountList = null;
		openMenu = null;
	}
	
	public void addToList(Account newAccount)
	{
		if(accountList.add(newAccount)) //should return a boolean
			System.out.println("The account has been added to the list");

		else
			System.out.println("an error has occured");
	}
	
	public void removeFromList(Account accountToDelete)
	{
		if(accountList.remove(accountToDelete)) // should return a boolean
			System.out.println("your account has been deleted!!");
		
		else
			System.out.println("an error has occured");
	}
	
	public void login(Account accountToLogin)
	{
		if (accountList.contains(accountToLogin)) // should return boolean
		{
			System.out.println("login was successful");
			
			openMenu.toMenu();
		}
		
		else
			System.out.println("the account was not found, try adding the account first");
	}
}

