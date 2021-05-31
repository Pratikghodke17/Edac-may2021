import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class expection {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		try{   
		      int data=100/0;
		    
		   }
		catch(ArithmeticException e )
		{
			System.out.println(e);}
		try {
			  int num[] = {1, 2, 3, 4};
		      System.out.println(num[5]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
			try{   
				System.out.println("Enter Integer Value: ");
	            Integer Int = scanner.nextInt(); 
	            System.out.println(Int);
			    
			   }
			catch(InputMismatchException ex) {
				System.out.println(ex);
				try {
					  
		            // Following file does not exist
		            File file = new File("file.txt");
		  
		            FileReader fr = new FileReader(file);
		        }
		        catch (FileNotFoundException ef) {
		            System.out.println(ef);
		        }
				
			}
			
		  } 
	

	}}


