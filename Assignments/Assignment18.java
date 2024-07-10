package Assignments;

import java.util.Scanner;

public class Assignment18 
{
	public static void main(String[] args) 
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Radius");
	double r = s1.nextDouble();
	System.out.println("pi");
	double pi = s1.nextDouble();
	double aoc = pi * r * r;
	System.out.println("Area of circle" +aoc);
	aoc = s1.nextDouble();
	System.out.println("Radius");
	double r1 = s1.nextDouble();
	System.out.println("pi");
	double pii = s1.nextDouble();
	double aocir = 2 * pii * r1;
	System.out.println("Area of circum12" +aocir);
	aocir = s1.nextDouble();
	double l = s1.nextDouble();
	System.out.println("Length");
	double b = s1.nextDouble();
	System.out.println("Breadth");
	double aor = l * b;
	aor = s1.nextDouble();
	System.out.println("Area of rectangle\n" +aor);
	
	}
}
