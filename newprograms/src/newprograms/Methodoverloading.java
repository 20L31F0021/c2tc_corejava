package newprograms;

public class Methodoverloading 
{
		
			public void add(int x,int y)
			{
				//System.out.println("the sum is "+x+y);  or
				
				System.out.println("the sum is "+(x+y));
			}
			public void add(int x,int y,int z)
			{
				System.out.println("the sum is "+x+y+z);
			}
			public void add(int x,int y,int z,int a)
			{
				System.out.println("the sum is "+x+y);
			}

			public static void main(String[] args) 
			{
				
				Methodoverloading  obj=new Methodoverloading();
				obj.add(3,4);
				obj.add(5,5,5);
				obj.add(4,6,6,4);
			}


}
