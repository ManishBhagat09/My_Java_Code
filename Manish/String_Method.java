package Manish;

public class String_Method 
{
public static void main(String[] args)
{
	String batch_name ="Ab43bymkt";
	int count = batch_name.length();
	System.out.println(count);
	System.out.println(batch_name.length());
	System.out.println(batch_name.toUpperCase());
	System.out.println(batch_name.toLowerCase());
	System.out.println(batch_name.charAt(7));
	System.out.println(batch_name.indexOf('b'));
	String name = "Manish Bhagat";
	System.out.println(name.trim());
	String name1 = "Manish Bhagat";
	System.out.println(name.equals(name1));
	System.out.println(name.equals("Manish Bhagat"));
	String a = "Manish";
	String b = "Manish Bhagat123";
	System.out.println(a.equalsIgnoreCase(a));
	System.out.println(name.contains("Manish"));
	System.out.println(name.contains("manish"));
	System.out.println(name.substring(5));
	System.out.println(name.substring(6));
	System.out.println(name.substring(0, 4));
	System.out.println(b.isEmpty());
	System.out.println(b.lastIndexOf('a'));
	System.out.println(b.indexOf('a'));
	String new1 = a.replace('M', 'a');
	System.out.println(new1);
	String new2 = b.replaceAll(" ","");   //replace all with nothing
	System.out.println(new2);
	System.out.println(a.replaceAll("Manish","MANISH"));   // replaceAll with 
	System.out.println(b.replaceAll("[0-9]", ""));    //replace all numberic with nothing
	System.out.println(b.replaceAll("[a-z]", ""));     //replace all lowercase letter with nothing
	String c = "AaBbCcDdEe FfGgHhIi";
	System.out.println(c.replaceAll("[A-Z]", ""));
	
	String d = "Ashwini Patil"; 
	System.out.println(d.matches("(.*)l"));   // l at the starting of string
	
	System.out.println(d.matches("A(.*)"));   // a at the starting of string
	
	System.out.println(d.matches("(.*)w(.*)"));   // w at the any index of string
	
	String  e = "Tom";
	System.out.println(e.matches("..."));        // single charcter
}
}