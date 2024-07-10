package Manish;

public class Logical_operator 
{
public static void main(String[] args) 
{
	int age = 18;
	char gender = 'M';
	
	if (age >= 18 && gender == 'F' )
	{
		System.out.println("Full ticket");
	}
	if (age >= 18 || gender == 'F')
	{
		System.out.println("statement 1");
	}

	if(! (age >= 18 || gender == 'F' ))
	{
		System.out.println("statement 2");
	}
	if (!(age >= 18 && gender == 'F' ))
	{
		System.out.println("Full ticket");
	}

}
}