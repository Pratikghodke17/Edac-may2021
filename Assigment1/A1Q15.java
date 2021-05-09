import java.util.*;
class A1Q15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter two variables x,y:");
		
		int i=sc.nextInt();
		int j=sc.nextInt();
		int temp;
		
		temp=i;
		i=j;
		j=temp;
		
		System.out.println("Swapped variables x,y:"+i+ " " +j);
}}