import java.util.*;
class Question6
{
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int a1[]=new int[x];
		
		for(int i=0;i<a1.length;i++)
		{
			System.out.println("Enter Element");
			a1[i]=sc.nextInt();
		}
		System.out.println();
		
		int max=a1[0];
		
		for(int i=1;i<a1.length;i++)
		{
			if(a1[i]>max)
				max=a1[i];
		}
		System.out.println("max="+max);
	}
}