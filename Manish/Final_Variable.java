package Manish;

public class Final_Variable 
{
	final static double pi=3.14;
	
	static void area()
	{
		double r =20;
		double aoc= pi * r * r;
		System.out.println(aoc);
	}
	static void circumference()
	{
		double r =20;
		double ac= 2 * pi * r;
		System.out.println(ac);
	}
public static void main(String[] args) 
{
	area();
	circumference();
	
	
}
}
