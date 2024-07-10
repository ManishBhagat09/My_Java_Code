package Manish;
class Father
{
	static void house() 
	{
		System.out.println("Father have house");
	}
	static void car() 
	{
		System.out.println("Father have car");
	}
}

public class Child extends Father
{
	static void laptop() 
	{
		System.out.println("child have laptop");
	}
	static void bike() 
	{
		System.out.println("child have bike");
	}
public static void main(String[] args) 
	{
	laptop();
	bike();
	car();
}
}
