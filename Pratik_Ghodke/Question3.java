import java.util.*;
class Question3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 swab no:");
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		int temp=0;
		
		System.out.println("Before swab" +i+ "," +j);
		
		temp=i;
		i=j;
		j=temp;
		
		System.out.println("After swab" +i+ "," +j);
	}
}