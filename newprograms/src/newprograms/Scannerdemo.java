package newprograms;
import java.util.Scanner;
public class Scannerdemo 
{
	public static void main(String[] args)
	{
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(" enter your name");
			String name = sc.nextLine();
			
			
			System.out.println(" enter your number");
			int number = sc.nextInt();
			
			
			System.out.println(" enter your salary");
			double salary = sc.nextDouble();
			System.out.println("Name : " + name);
			System.out.println("Number : " + number);
			System.out.println("salary : " + salary);
		}
		
		
	}
	
	
}
