package myprograms;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        
		int i=0;
		System.out.println("enter the value of n");
		try (Scanner sc = new Scanner(System.in)) 
		{
			int n=sc.nextInt();
			for(i=0;i<n;i++)
			{
				System.out.println("*");
			}
		}
		
	}

}
