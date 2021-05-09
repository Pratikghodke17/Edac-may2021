import java.util.*;
class A1Q11
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter radius: ");
		double R1= sc.nextDouble();
		double d1=3.14;
		double d=d1*R1*R1;
		double d2=2*d1*R1;
		System.out.println("Area:"+d);
		System.out.println("Perimeter is:"+d2);
		
	}
}