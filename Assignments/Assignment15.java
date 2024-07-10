package Assignments;

public class Assignment15 
{
	static void area(double pi )
	{
		double r = 20;
		double aoc = pi * r * r;
		double ac = 2 * pi * r;
		System.out.println("Area of circle is\n" +aoc);
		System.out.println("Area of circum is\n" +ac);
	}
static void area(double pi, double r)
{
	double aoc;
	aoc = pi * r * r;
	double ac = 2 * pi * r;
	System.out.println("Area of circle is\n" +aoc);
	System.out.println("Area of circum is\n" +ac);
	
}
	
void area( )
{
	double pi = 3.1455;
	double r = 20;
	double aoc = pi * r * r;
	double ac = 2 * pi * r;
	System.out.println("Area of circle is\n" +aoc);
	System.out.println("Area of circum is\n" +ac);
}
public static void main(String[] args) 
{
	Assignment15 a15 = new Assignment15();
	a15.area();
	area(3.144);
	area(3.14,10);

}
}


