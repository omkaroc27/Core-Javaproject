package fileOption;

import java.io.FileOutputStream;
import java.util.Scanner;

public class CreatingFiles {

   void create() {
	

            
           	   { 
                      String p=setpath(); 
                      try {
						write(p);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
                      System.out.print("\n File Created Successfully"); }
               } 
           
                  static String setpath() 
            { 
                     Scanner read =new Scanner(System.in); 
                     String path; 
                     System.out.println("Enter Your File Name With (*extension*):"); 
                     return read.nextLine(); 
            } 
                     static void write(String path)throws Exception 
                     { 
                         Scanner sc =new Scanner(System.in); 
                         FileOutputStream fos=new FileOutputStream(path); 
                 
                         
                      } 
                  
 } 