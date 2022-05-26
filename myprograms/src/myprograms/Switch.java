package myprograms;
import java.util.Scanner;
public class Switch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      

		System.out.println("enter the city");
		try (Scanner sc = new Scanner(System.in)) {
			String city= sc.nextLine();
			
			  
			switch (city) 
			{ 
			case "mumbai" : 
				System.out.println("The city is mumbai");break;

			case "chennai" :
				System.out.println("The city is chennai ");break;
			case "hyderabad" : 
				System.out.println("The city is hyderabad");break;
			default:
			    System.out.println("The city is " + city);
				break;

}
		}
}
}