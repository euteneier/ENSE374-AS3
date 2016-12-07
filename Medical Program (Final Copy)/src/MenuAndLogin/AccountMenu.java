package MenuAndLogin;

//import account.*;
import database.*;
//import net.*;
import photo.*;

import java.util.Scanner;

public class AccountMenu 
{
	private int option;
	private String search;
	
	public AccountMenu()
	{
		option = 0;
		search = null;
	}
	
	public void menu()
	{
		Scanner in = new Scanner(System.in);
		
		do
		{
			System.out.println("please select the option you wish to select");
			System.out.println("1) to search the database") ;
			System.out.println("2) to search for a photo of a medication");
			System.out.println("3) to put in a request to the pharmacy");
			System.out.println("4) to choose between photo scan or digital");
			System.out.println("5) to logout");
			
			option = in.nextInt();
			
			while (!(option == 1 || option == 2 || option == 3 || option == 4 || option == 5))
			{
				System.out.println("invalid input please enter again");
				option = in.nextInt();
			}
			
			if (option == 1)
			{
				// insert function call for database functionality
				System.out.println("please enter what you would like to search");
				
				search = in.next();
				
				database.search(search);
			}
			
			else if (option == 2)
			{
				// insert function call photo functionality
				photo.LoadPicture();
			}
			
			else if (option == 3)
			{
				// insert function call for pharmacy request functionality
			}
			
			else if (option == 4)
			{
				// insert function call for photo scan/digital functionality
			}
			
		} while (option != 5); // option to logout
		
		System.out.println("logout was successful");
		
		in.close();
	}
}
