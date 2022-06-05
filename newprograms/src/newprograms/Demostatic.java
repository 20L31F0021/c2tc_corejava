package newprograms;

public class Demostatic 
{
	int rollno;  
    String name;  
    static String college = "ITS"; 
    
    
    //static method to change the value of static variable  
    static void change()
    {  
      college = "BBDIT";  
    }
    
   
    //constructor to initialize the variable  
    Demostatic (int r, String n)
    {  
        rollno = r;  
       name = n;  
    }  
    
    //method to display values  
    void display()
    { 
    	System.out.println(rollno+" "+name+" "+college);
    }  
  
   public static void main(String args[])
   {  
	   Demostatic.change();//calling change method  
       
	   Demostatic  s1 = new Demostatic (111,"Karan");   //creating objects  
       Demostatic  s2 = new Demostatic (222,"Aryan");  
       Demostatic  s3 = new Demostatic (333,"Sonoo");  
     
       s1.display();  //calling display method
       s2.display();  
       s3.display();  
   }  
}  