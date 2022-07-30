package mypackage;

import java.io.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

	
 public static void add() throws IOException
 {
	 System.out.println("Enter your file name");
	 Scanner s = new Scanner(System.in);
	 String p = s.nextLine();
	 
	 File f = new File("C:\\sri"+p);
	 
	 if(f.createNewFile())
		 System.out.println("File is created");
	 else
		 System.out.println("File is alredy exist");
 }
 
 
 
 public static void delete()
 {
	 System.out.println("Enter file name for delete ex:- abc.txt");
	 Scanner ss = new Scanner(System.in);
	 String pp = ss.nextLine();
      
	 File ff = new File("C:\\sri"+pp);	
	 
	 if(ff.delete())
		 System.out.println("File is deleted");
	 else
		 System.out.println("File is not deleted or file is not found");
 }
 
 
 
 public static void search()
 {
	 System.out.println("Enter your file name to search");
	 Scanner sss = new Scanner(System.in);
	 String ppp = null;
	 ppp = sss.nextLine();
	 File fff = new File("C:\\sri"+ppp);
	 if( fff.exists())
	 {
		System.out.println("File is available"); 
	 }
	 else 
		 System.out.println("File is not available");
 }
 
 
 
 public static void accendingorder()
 {
	
		
		File dir = new File("C:\\sri");
	    if(dir.isDirectory())
	    {
	      //  fetching the file from list the directory
	      File[] files = dir.listFiles();

	      System.out.println("All the files including folders");
	      System.out.println("--------------------------------");
	   
	   

	      // sort files by name
	      Arrays.sort(files, new Comparator()
	      {
	        @Override
	        public int compare(Object f1, Object f2) {
	          return ((File) f1).getName().compareTo(((File) f2).getName());
	        }
	      });

	      //  print the file name in accending order.
	      for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	      System.out.println("\nAfter sorting by name");
	      System.out.println("----------------------------------");

	      // This is through Sort files by size.
	      Arrays.sort(files, new Comparator()
	      {
	        @Override
	        public int compare(Object f1, Object f2)
	        {
	          if (((File) f1).length() < ((File) f2).length())
	          {
	            return -1;
	          }
	          else if (((File) f1).length() > ((File) f2).length())
	          {
	            return 1;
	          }
	          else
	          {
	            return 0;
	          }
	        }
	      });

	      // Prints files in order by file size
	      for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	      System.out.println("\nAfter sorting by length");
	      System.out.println("-------------------------------");

	      
	      for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	      System.out.println("-------------------------");
	      System.out.println("-------------------------");
	    }
		
 }
 

 public static void main(String[] args) throws IOException {
	 
	 
		
		while(true)
		{
			System.out.println("Enter 1 : get file names in ascending order");
			System.out.println("Enter 2:  for Business Level Operation");
			System.out.println("Enter 3: Close the Application");

			System.out.println("Enter your choice");
			
			Scanner v = new Scanner(System.in);
			
			int option= v.nextInt();

			if(option==1)
			{
				accendingorder();
			}

			else if(option ==2)
			{
				System.out.println("\n--->Select Any one to perform business levele operations");
				System.out.println("\nEnter 1 : add file");
				System.out.println("Enter 2:  delete file");
				System.out.println("Enter 3:  search file");
				System.out.println("Enter 4:  go back");
				
				System.out.println("Enter your choice :- ");
				
				int input = v.nextInt();
				
				switch(input)
				{
				
				case 1: {	add();  break;  }
					
			    case 2: { delete(); break;  }
				
				case 3: { search(); break;  }
				
				case 4: {  System.out.println("Back is Successful"); break;  }
					   
		     }
		 }
			
			else if(option == 3 )	
			{ 	 System.out.println(" Exit ");	
			      System.exit(option); 
			}
			
			else
			{
				System.out.println("Kindly enter valid input");
			}
}
				
}
	}