package Manish;

public class Method_overloading 
{
	static void add()
	{
		System.out.println(1);
	}
	static void add(int a)
	{
		System.out.println(2);
	}
	static void add(double b, int a)
	{
		System.out.println(3);
	}
	static void add(int b, double a)
	{
		System.out.println();
	}
	static void add(double c)
	{
		System.out.println();
	}
	static void add(int b, int a)
	{
		System.out.println();
	}
public static void main(String[] args) 
{
	add();
	add(2);
	add(1.3,3);
	
}
}
