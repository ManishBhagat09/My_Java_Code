package Manish;

public class Access_Specifier
{
	public static void add()
	{
		System.out.println("A");
	}
	protected static void sub()
	{
		System.out.println("S");
	}
	private static void mul()
	{
		System.out.println("M");
	}
	static void div()
	{
		System.out.println("D");
	}
public static void main(String[] args) 
{
	add();
	sub();
	mul();
	div();
}
}
