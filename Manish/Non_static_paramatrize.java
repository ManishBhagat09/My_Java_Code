package Manish;

public class Non_static_paramatrize 
{
	void add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	void add(double a, int b)
	{
		double sum = a+b;
		System.out.println(sum);
	}
public static void main(String[] args)
{
	Non_static_paramatrize r1 = new Non_static_paramatrize();
	r1.add(1, 4);
	r1.add(1.4, 4);
	
}

}
