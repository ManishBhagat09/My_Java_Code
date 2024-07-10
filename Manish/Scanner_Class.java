package Manish;
import java.util.Scanner;

public class Scanner_Class 
{
public static void main(String[] args) 
{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter value of a");
	int a = s1.nextInt();
	System.out.println("Enter value of b");
	int b = s1.nextInt();
	int sum = a+b;
	System.out.println("Addition of a and b is\n" +sum);
}
	}


