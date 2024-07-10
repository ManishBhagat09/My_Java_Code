package Assignments;

class Board_1 
{
	Board_1(int a)
	{
		System.out.println("Select board");
	}

}
class College_1 extends Board_1
{
	College_1()
	{
		
		super(100); 
		System.out.println("Select college1 ");
	}
}
class College_2 extends College_1
{
	College_2()
	{
	
		super(); 
		System.out.println("Select college2 ");
	}
}
public class Assignment25 extends College_2
{
	Assignment25()
	{
		super(); 
		System.out.println("Select college3");
	}
public static void main(String[] args) 
{
	new Assignment25();
	
}
}