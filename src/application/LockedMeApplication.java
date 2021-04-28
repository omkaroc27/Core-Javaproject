package application;

import fileOption.*;
import Showallfile.*;
import java.util.Scanner;

public class LockedMeApplication {

	public static int mainmenu() {
		Scanner in = new Scanner(System.in);
		// Display the menu
		//System.out.println();
		System.out.println("                         **************************************"); 
		
		System.err.println("                         *                                    *" );
		
		System.err.println("                         ***********  LockedMe.com  ***********                        Developed by:omkarcharate");
		System.err.println("                         *                                    *                        EmailId:omkarcharate27@gmail.com");
		
		System.out.println("                         **************************************"); 
		System.out.println();
		
		System.out.println("                         ********* LockedMe Application *******                               ");
		System.out.println("***********************************************************************************************");
		System.out.println("1.  Show all files present in Directory");
		System.out.println("2.  File option Menu");
		System.out.println("3.  Exit (back to Main Menu)");
		
		System.out.println();
		System.out.print("*********Please enter your choice:-");

		// Get user's choice
		int choice = in.nextInt();

		// Display the title of the chosen module
		switch (choice) {
		case 1:
			
			ShowallFiles sf=new ShowallFiles();
			sf.Show();
			break;
			   

		case 2:
			
			FileManagement fm=new FileManagement();
			fm.Filemenu();
			break;
			
		
		case 3:
			mainmenu();
			break;

		default:
			System.out.println("Invalid choice");
		}
		return choice;}

	public static void main(String[] args) {
	 
			int user;
	  user=mainmenu();
  }}
