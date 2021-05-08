import java.util.*;

class Question5
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int a1[] = new int[3];
	System.out.println("Enter input");
	for (int i=0; i < a1.length;i++)
		
	{
		a1[i]=sc.nextInt();
	}
	System.out.println("***************************************");
	for(int i=a1.length-1;i>=0;i--)
	{
		System.out.println(a1[i]);
	}
	}
}