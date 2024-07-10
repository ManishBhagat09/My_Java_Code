package Manish;

import java.util.Arrays;

public class Array_Program 
{
public static void main(String[] args) 
{
	String  name[] = new String[3];
			name[0] = "Manish";
			name[1] = "Jaywant";
			name[2] = "Bhagat";
	
/*	for(int i =0; i<=2; i++)
	{
	System.out.println(name[i]);
	}
	*/
	System.out.println(Arrays.toString(name));
	
	int rollno [] = new int[3];
	rollno[0] = 11;
	rollno[1] = 22;
	rollno[2] = 33;
	System.out.println(Arrays.toString(rollno));
	
	char gender[] = new char[2];
	gender[0] = 'M';
	gender[1] = 'F';
	System.out.println(Arrays.toString(gender));
	
	boolean ab[] = new boolean[2];
	ab[0]= true;
	ab[1]= false;
	System.out.println(Arrays.toString(ab));
	
}

}
