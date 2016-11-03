package Assignment3;

import java.util.LinkedList;

public class AccountList 
{
	private LinkedList<AccountInfo> accountList = new LinkedList<AccountInfo>();
	
	public AccountList()
	{
		accountList = null;
	}
	
	public void addToList(AccountInfo newAccount)
	{
		if(accountList.add(newAccount)) //should return a boolean
			System.out.println("The account has been added to the list");

		else
			System.out.println("an error has occured");
	}
	
	public void removeFromList(AccountInfo accountToDelete)
	{
		if(accountList.remove(accountToDelete)) // should return a boolean
			System.out.println("your account has been deleted!!");
		
		else
			System.out.println("an error has occured");
	}
	
	public void login(AccountInfo accountToLogin)
	{
		if (accountList.contains(accountToLogin)) // should return boolean
			System.out.println("login was successful");
		
		else
			System.out.println("the account was not found, try adding the account first");
	}
}
