/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
public class P14
{
    public static void main(String args[])  
    { 
        int i, j,num; 
    
        for(i=1; i<=5; i++)
        { 
            num=1; 
            for(j=5; j>=i; j--)
            { 
                 
                System.out.print(num+" "); 
    
                
                num++; 
            } 
    
            System.out.println(); 
        } 
    } 
       
   
}