package Assignment3;

public class Account 
{
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private AccountMenu menu = new AccountMenu();
	
	public Account()
	{
		firstName = null;
		lastName = null;
		userName = null;
		password = null;
		menu = null;
	}
	
	public Account(String firstName, String lastName, String userName, String password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.menu = null;
	}
	
	public void toMenu()
	{
		// directs to account menu
		menu.menu();
	}
	
	/*
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName (String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setUserName (String userName)
	{
		this.userName = userName;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	*/
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public String getUserName()
	{
		return this.userName;
	}
	
	public String getPassword()
	{
		return this.password;
	}
}