import java.util.*;
class A1Q22
   {
    public static void main(String[] args)
    {
	  int binary[]= new int[20];
	  Scanner sc= new Scanner(System.in);
	  int a=sc.nextInt();
	  int r,index=0;
	  while(a>0)
	  {
	    r=a%2;
		binary[index++]=r;
		a=a/2;
	  
	  }
	   for (int i=index-1;i>=0;i--)
	 {
		
	System.out.print(binary[i]);
	               			 
	}
 
				 
    }
   }
