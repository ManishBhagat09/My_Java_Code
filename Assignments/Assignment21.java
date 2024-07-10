package Assignments;
class User_Id
{
	 void username1()
	{
		System.out.println("Enter usernme");
	}
}
class Pass extends User_Id
{
     void password1()
	{
		System.out.println("Enter password");
	}
}
public class Assignment21 extends Pass
{
	 void login()
	{
		System.out.println("Click on login");
	}

public static void main(String[] args) 
{
	Assignment21 a21 = new Assignment21();
	a21.username1();
	a21.password1();
	a21.login();
	
}
}
