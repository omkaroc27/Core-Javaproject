package fileOption;

import java.util.Scanner;

public class FileManagement {

	public static int Filemenu() {
		Scanner in = new Scanner(System.in);
		// Display the menu
		System.out.println();
		System.err.println("                         ********* LockedMe.com ****************                          ");
		System.out.println("                         ********* FILE OPTION MENU ************                                ");
		System.out.println("***********************************************************************************************");
		System.out.println("1.  Creating_New_File");
		System.out.println("2.  Write_in_File");
		System.out.println("3.  Read_File");
		System.out.println("4.  FileInformation");
		System.out.println("5.  Delete_File");
		System.out.println("0.  Exit(back to main Menu)");

		System.out.println();
		System.out.print("*********Please enter your choice:-");

		// Get user's choice
		int choice = in.nextInt();

		// Display the title of the chosen module
		switch (choice) {
		case 1:
			System.out.print("creating file: ");
			    CreatingFiles cf=new CreatingFiles();
			    cf.create();
			    break;

		case 2:
			System.out.println("write a file: ");
			WriteFile wf = new WriteFile();
			wf.write();
			break;
		case 3:
			System.out.println("read a files: ");
			ReadFile re = new ReadFile();
			re.Read();
			break;
		case 4:
			System.out.println("file information: ");
			FileInformation fi = new FileInformation();
			fi.fileinfo();
			break;
		case 5:
			System.out.println("Delete a File: ");
			DeleteFile df = new DeleteFile();
			df.Delete();

			break;
		case 0:
			Filemenu();

		default:
			System.out.println("Invalid choice");
		}
		return choice;}}

//	public static void main(String[] args) {
//	 
//			int user;
//	  user=Filemenu();
//  }}
