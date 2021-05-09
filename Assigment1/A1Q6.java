import java.util.Scanner;
public class A1Q6
{
public static void main(String args[]) 
{
Scanner sc = new Scanner (System.in);

	System.out.println ("Input first number");
	System.out.println ("Input second number");
	
	int i=sc.nextInt();
    int j=sc.nextInt();
	int a=i+j;
	int b=i*j;
	int c=i-j;
	int d=i/j;
	int e=i%j;
	
	
	System.out.println ("Output:"+a);
	System.out.println ("Output:"+b);
	System.out.println ("Output:"+c);
	System.out.println ("Output:"+d);
	System.out.println ("Output:"+e);
 }
}