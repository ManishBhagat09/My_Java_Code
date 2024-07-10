package Manish;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Program3 
{
public static void main(String[] args) 
{
	double a[] = new double[3];
	Scanner s1 = new Scanner(System.in);
	
	for(int i=0; i<3; i++)
	{
		a[i] = s1.nextInt();
	}
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	
	System.out.println(Arrays.toString(a));
}
}