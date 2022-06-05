package newprograms;
//import java.io.*;
//import java.lang.reflect.Method;

public class Methods  
{
		static int id;
		static String name;
		
		public void setid(int empid)
		{
			id = empid;
		}
		
		public void setname(String empname)
		{
			name=empname;
		}
		
  public static void main(String[] args)
    {	
	  Methods m=new Methods();
	  m.setid(8);
	  m.setname("RANBIR KAPOOR");
	  System.out.println(id);
	  System.out.println(name);
	}

}
