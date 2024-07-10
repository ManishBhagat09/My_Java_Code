package Assignments;
class Username
{
	static void username()
	{
		System.out.println("Enter usernme");
	}
}
class Password extends Username
{
	static void password()
	{
		System.out.println("Enter password");
	}
}
public class Assignment20 extends Password
{
	static void login()
	{
		System.out.println("Click on login");
	}

public static void main(String[] args) 
{
	username();
	password();
	login();
}
}
