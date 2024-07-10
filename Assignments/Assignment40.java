package Assignments;

public class Assignment40 
{
public static void main(String[] args)
{
	String a="manish";
	String b="";
	
	for(int i=a.length()-1; i>=0;i--)
	{
		char c1= a.charAt(i);
		b = a+c1;
		System.out.println(c1);
	}
}
}
