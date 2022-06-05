package newprograms;

public class Democonstr 
{

		int num,num1,num2;
		
		 public Democonstr()    //default constr
		 {
			 num=7;
		 }
		
	/*	 public Democonstr(int num,int num1)        //parameterized constrs
		 {
			 num=num;
			 num1=num1;
		 }
	*/	
		 
		 public Democonstr(int n,int j,int k)
		  {
			num=n;
			num1=j;
			num2=k;
		  }
		 
		 
public static void main(String[] args) 
		{
		 Democonstr obj=new Democonstr(7,9,3);
		 System.out.println("the value of num"+obj.num);
		 System.out.println("the value of num"+obj.num1);
		 System.out.println("the value of num"+obj.num2);
		}

	

}
