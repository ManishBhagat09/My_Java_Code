package Manish;

public class Non_static_non_paramatrize 
{
	void add()
	{
		int a = 1;
		int b = 1;
		double sum = a+b;
		System.out.println(sum);
	}
	void sub()
	{
		int a = 1;
		int b = 1;
		double sub = a-b;
		System.out.println(sub);
	}
public static void main(String[] args) 
{
	Non_static_non_paramatrize r1 = new Non_static_non_paramatrize();
	r1.add();
	r1.sub();
}
}
