import java.util.*;
class Question2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter No:");
		
		int i = sc.nextInt();
		int j = 0;
		
		for(j=1;j<=10;j++)
	{
		int y=(i*j);
		
		System.out.println(i+"*"+j+"="+y);
	}
	}
}
		