package Assignment3;

import java.util.Scanner;

public class UserMenu 
{
	public static void main (String[] args)
	{
		int option = 0;
		Account dumby1 = new Account (); //remove after, just testing
		Account dumby2 = new Account(); // remove after, just testing
		Account dumby3 = new Account(); // remove after, just testing
		CreateAccount createNewAccount = new CreateAccount();
		DeleteAccount accountToDelete = new DeleteAccount();
		LoginAccount accountToLogin = new LoginAccount();
		AccountList list = new AccountList(); // remove after, just testing
		
		Scanner in = new Scanner(System.in);
		
		do
		{
			System.out.println("please select the option you wish to select");
			System.out.println("1) to create an account") ;
			System.out.println("2) to login to an account");
			System.out.println("3) to delete an account");
			System.out.println("4) to exit");
			
			option = in.nextInt();
			
			// error checks the users input
			while (!(option == 1 || option == 2 || option == 3 || option == 4))
			{
				System.out.println("invalid input please enter again");
				option = in.nextInt();
			}
			
			// option to create a new account
			if (option == 1)
			{
				dumby1 = createNewAccount.addAccount();
				
				list.addToList(dumby1);
			}
			
			// option to login to an account
			else if (option == 2)
			{
				dumby2 = accountToLogin.loginToAccount(); // returns account comparison
				
				list.login(dumby2);
			}
			
			// option to delete an account
			else if (option == 3)
			{
				dumby3 = accountToDelete.AccountToDelete();
				
				list.removeFromList(dumby3);
			}
			
		}while(option != 4); // option to exit
		
		System.out.println("goodbye");
		
		in.close();
	}
}
