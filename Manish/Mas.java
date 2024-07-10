package Manish;


public class Mas {
	static void add()
	{
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
	}
	static void sub()
	{
		int a = 10;
		double b = 20;
		double sub = a - b;
		System.out.println(sub);
	}
	static void mul()
	{
		int a = 10;
		double b = 20;
		double mul = a * b;
		System.out.println(mul);
	}
	static void div()
	{
		int a = 10;
		double b = 20;
		double div = a / b;
		System.out.println(div);
	}
	static void modulus()
	{ 
		int a = 10;
		double  b = 20;
		double mod = a % b;
		System.out.println(mod);
	}
	
public static void main(String[] args) 
{
	
	System.out.println("Data");
	add();
	mul();
	sub();
	div();
	modulus();
}
}
