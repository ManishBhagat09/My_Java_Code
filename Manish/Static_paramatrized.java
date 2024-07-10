 package Manish;

public class Static_paramatrized 
{
	static void add(int a, int b)
	{
		System.out.println("Addition is " +(a + b));
	}
	static void add(double a, int b)
	{
		System.out.println("Addition is " +(a + b));
	}
	static void mul(double a , int b)
	{
		double mul = a * b;
		System.out.println(mul);
	}
public static void main(String[] args) 
{
	
	add(1,3);
	add(1.9, 10);
	
}
}
