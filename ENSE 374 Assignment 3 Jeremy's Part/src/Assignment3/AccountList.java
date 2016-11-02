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
		accountList.add(newAccount);	
	}
	
	public void removeFromList(AccountInfo accountToDelete)
	{
		accountList.remove(accountToDelete);
		
		System.out.println("your account has been deleted!!");
	}
}
