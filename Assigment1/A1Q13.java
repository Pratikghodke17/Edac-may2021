import java.util.*;
class A1Q13
{
	public static void main(String args[])
	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Input Width and Height:");
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double p=2*(w+h);
		double a=w*h;
		
		System.out.println("Perimeter is "+p);
		System.out.println("area is "+a);
	}
}
		