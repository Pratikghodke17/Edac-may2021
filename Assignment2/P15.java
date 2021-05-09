/*
5 4 3 2 1
5 4 3 2
5 4 3
5 4 
5
*/
public class P15
{
    public static void main(String args[])  
    { 
        int i, j,num; 
    
        for(i=1; i<=5; i++)
        { 
            num=5; 
            for(j=5;j>=i; j--)
            { 
                 
                System.out.print(num+" "); 
    
                
                num--; 
            } 
    
            System.out.println(); 
        } 
    } 
       
   
}