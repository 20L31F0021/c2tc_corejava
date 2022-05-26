package myprograms;

public class Patterns {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         int i,j;
        
	     for(i=0;i<5;i++)
	        {
	        	//System.out.println(" ");
	        	
	        	for(j=0;j<=i;j++)
	        	{
	    			
	    			System.out.print("* ");
	        	}
	        	
	        	System.out.print("\n");
	        }	
		 
		 
	//new   
         
		 for(i=0;i<5;i++)
	        {
	        	//System.out.println(" \n");
	        	
	        	for(j=5;j>=i+1;j--)
	        	{
	    			
	    			System.out.print("* ");
	        	}
	        	
	        	System.out.print("\n");
	        }		 
	}

}
