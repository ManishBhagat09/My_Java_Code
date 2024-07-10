package Manish;
import java.lang.Math;

public class Math_Class 
{

	public static void main(String[] args) 
	{
		//Math.addExact(12, 12);// any static method can be call by  class.methodname
		System.out.println(Math.addExact(12, 12));
		System.out.println(Math.addExact(10000, 1000000));
		System.out.println(Math.subtractExact(122, 1230));
		System.out.println(Math.subtractExact(100, 900));
		System.out.println(Math.multiplyExact(12, 12));
		System.out.println(Math.multiplyExact(1111111, 34));
		System.out.println(Math.multiplyExact(11111, 11111));
		System.out.println(Math.max(12, 2));
	    System.out.println(Math.max(13344,11111));
	    System.out.println(Math.max(13.4, 13.4));
	    System.out.println(Math.min(12.3, 13.4));
	    System.out.println(Math.min(2.39f, 3.23f));
	    System.out.println(Math.min(1343, 1432));
	    System.out.println(Math.min(122333, 012222));
	    System.out.println(Math.sqrt(13.4));
	    System.out.println(Math.sqrt(-9));
	    double no = Math.abs(-81);
	    System.out.println(81);
	    System.out.println(Math.abs(no));
	    System.out.println(Math.abs(16));
	    System.out.println(Math.random());     //Always generate random number between 0 and 1 
	    double pi = Math.PI;    //static final variable
	    int r=10;
	    double aoc = pi*r*r;
	    System.out.println(aoc);
	    System.out.println(pi);
	    System.out.println(Math.PI);
	}
}