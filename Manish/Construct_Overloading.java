package Manish;

public class Construct_Overloading {
	Construct_Overloading (String name, int a)
	{
		System.out.println("Welcome3");
	}
	Construct_Overloading (String name)
	{
		System.out.println("Welcome 1");
	}

public static void main(String[] args) 
{
	Construct_Overloading a1 = new Construct_Overloading("manish", 1);
	new Construct_Overloading("Manish");
}

}


