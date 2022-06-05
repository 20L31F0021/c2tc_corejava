package newprograms;

class Animal
{
	public void show()
		{
			System.out.println("this is animal class");
		}
}
	
class Dog
	{
		public void show()
		{
			System.out.println("this is dog class");
		}
	}
class wildfox
{
	public void show()
		{
			System.out.println("this is wild class");
		}
}

public class Demoinstance 
{

		public static void main(String[] args) 
		{
			Animal ob=new Animal();
			Dog obj=new Dog();
			wildfox obj1=new wildfox();
			
			if(ob instanceof Animal)
			 {
				System.out.println("ob is object of Animal");
			 }
			else
			 {
				System.out.println("ob is not a object of animal ");
			 }
				
		}

}


