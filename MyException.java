public class MyException extends Exception
{
	//ID - 21CE142
	//Name - Krishna M. Thakor
	//Aim - WAP to generate user defined exception using “throw” and “throws” keyword.

	private int Detail;
	
	MyException(int a)
	{
		Detail = a;
	}
	
	public String toString()
	{
		return "MyException[" + Detail + "]";
	}
}