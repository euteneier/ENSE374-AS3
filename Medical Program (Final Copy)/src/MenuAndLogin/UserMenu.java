package MenuAndLogin;

import java.util.Scanner;

public class UserMenu 
{
	public static void main (String[] args)
	{
		int option = 0;
		CreateAccount createNewAccount = new CreateAccount();
		DeleteAccount accountToDelete = new DeleteAccount();
		LoginAccount accountToLogin = new LoginAccount();
			
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
				createNewAccount.addAccount();
			}
				
			// option to login to an account
			else if (option == 2)
			{
				accountToLogin.loginToAccount(); // returns account comparison
			}
				
			// option to delete an account
			else if (option == 3)
			{
				accountToDelete.AccountToDelete();
			}
				
		}while(option != 4); // option to exit
			
		System.out.println("goodbye");
			
		in.close();
	}
}


