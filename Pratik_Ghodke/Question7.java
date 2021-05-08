class Question7
{
	public static void main(String[] args)
	{
		double y = 32.7842;
		int x = (int) y; //narrow
		
		System.out.println(y);
		System.out.println(x);
		
		System.out.println("------------------------------");
		
		int i = 34;
		double j = (double) i;//wide
		
		System.out.println(i);
		System.out.println(j);
		
  }
}