package newprograms;

public class Cnstrthis 
{

		int num,num1,num2;
		 public Cnstrthis()
		 {
			 num=7;
		 }
		 public Cnstrthis(int num,int num1)
		 {
			 this.num=num;
		     this.num1=num1;
		 }
		public Cnstrthis(int n,int j,int k)
		{
			num=n;
			num1=j;
			num2=k;
		}
		public static void main(String[] args) 
		{
			Cnstrthis obj=new Cnstrthis(7,9);
			 System.out.println("the value of num"+obj.num);
			 System.out.println("the value of num"+obj.num1);
			 System.out.println("the value of num"+obj.num2);

		}

}
