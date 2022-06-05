package newprograms;
class outerclass 
{
    void show()
    {
    	System.out.println("outer class");
    }
    class innerclass
    {
    	void display()
    	{
    		
    	System.out.println("inner class");
        }
    }   
public static void main(String[] args) 
	{
        
		outerclass obj1=new outerclass();
		obj1.show();
		
		//outerclass.innerclass obj2=new outerclass.innerclass();
		//obj2.display();
	}

}

