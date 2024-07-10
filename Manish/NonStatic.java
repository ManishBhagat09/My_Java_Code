package Manish;

public class NonStatic 
{
	static void add()
	{
		System.out.println("Addition");
	}
	void sub()
	{
		NonStatic s1 = new NonStatic();
		s1.sub();
		//System.out.println("Substraction");
		//NonStatic s2 = new NonStatic();
		//s1.sub();
	}
    void mul()
    {
    System.out.println("Multiplication");	
    }
	public static void main(String[] args) 
{
	System.out.println("Substraction");
	//NonStatic s1 = new NonStatic();
	//add();
	//s1.sub();
	

}
}
