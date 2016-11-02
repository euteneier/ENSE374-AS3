package Assignment3;

import java.util.Scanner;

public class UserMenu 
{
	public static void main (String[] args)
	{
		int option = 0;
		CreateAccount createNewAccount = new CreateAccount();
		Scanner in = new Scanner(System.in);
		
		do
		{
			System.out.println("please select the option you wish to select");
			System.out.println("1) to create login inofrmation for the account") ;
			System.out.println("2) to login to account");
			System.out.println("3) to enter prescription information");
			System.out.println("4) to search and view the prescription information in the database");
			
			option = in.nextInt();
			
			// error checks the users input
			while (!(option == 1 || option == 2 || option == 3 || option == 4))
			{
				System.out.println("invalid input please enter again");
				option = in.nextInt();
			}
			
			if (option == 1)
			{
				createNewAccount.addAccount();
			}
			
			else if (option == 2)
			{
				// allows the user to login to one of the accounts in the list
				// must be an account in the list
				
			}
			
			else if (option == 3)
			{
				// must be logged into an account in oder to create prescription information
				
			}
			
			else if (option == 4)
			{
				// must have a prescription order created to view in database
			}
			
		}while(option != 5);
		
		System.out.println("goodbye");
		
		in.close();
	}
}
