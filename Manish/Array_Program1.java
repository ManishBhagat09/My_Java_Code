package Manish;

import java.util.Arrays;

public class Array_Program1 
{
public static void main(String[] args) 
{
String name1[] = new String[3];
name1[0]= "Ram";
name1[1]= "Sham";
name1[2]= "Manish";

String name2[] = new String[3];
name2[0]= "Ram";
name2[1]= "Sham";
name2[2]= "Manish";

System.out.println( Arrays.equals(name1, name2));

}
}
