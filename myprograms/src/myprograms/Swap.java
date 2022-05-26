package myprograms;

import java.util.Scanner; 

public class Swap 
{

    public static void main(String[] args) 
         {
			// TODO Auto-generated method stub

			/* System.out.println("enter the value of a");
			Scanner sc =new Scanner(System.in);
			int a=sc.nextInt();
			
			System.out.println("enter the value of b");
			
			int b=sc.nextInt();
			
			System.out.println("before swapping : a="+a+  "b="+b);
			
			a=a+b;
			b=a-b;
			a=a-b;
			
			
		    System.out.println("after swapping : a="+a+  "b="+b);		
		*/
			
			
			
		  /*  System.out.println("enter the value of a");
			Scanner sc =new Scanner(System.in);
			int a=sc.nextInt();
			
			System.out.println("enter the value of b");
			int b=sc.nextInt();
			
			
			System.out.println("before swapping : a="+a+  "b="+b);
		
			System.out.println("after swapping : a="+b+  "b="+a);
		
		*/
		
			    System.out.println("enter the value of a");
				try (Scanner sc = new Scanner(System.in)) 
				{
					int a=sc.nextInt();
					
					System.out.println("enter the value of b");
					int b=sc.nextInt();

					System.out.println("before swapping : a="+a+  "b="+b);

					 int temp=a;
					 a=b;
					 b=temp;
					 
					System.out.println("after swapping : a="+a+  "b="+b);
				}

		}

	}



