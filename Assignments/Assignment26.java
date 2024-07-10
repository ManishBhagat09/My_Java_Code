package Assignments;

import Manish.Construct_Overloading;

public class Assignment26 
{
	Assignment26 ( int a)
	{
		System.out.println("Welcome 1");
	}
	Assignment26 (String name)
	{
		this(54);
		System.out.println("Welcome 2");
	}
	Assignment26 (float b)
	{
		this("manish");
		System.out.println("Welcome 3");
	}
public static void main(String[] args) 
{
	new Assignment26(9.0f);
	
}
}




