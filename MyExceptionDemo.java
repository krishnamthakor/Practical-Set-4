public class MyExceptionDemo
{
	static void compute(int a) throws MyException
	{
		System.out.println("Called Compute(" + a + ")");
		
		if(a>10)
		{
			throw new MyException(a);
		}
		
		System.out.println("Normal Exit.");
	}
	
	public static void main(String args[])
	{
		try
		{
			compute(1);
			compute(20);
		}
		
		catch(MyException e)
		{
			System.out.println("Caught" + e);
		}
		
		System.out.println();
        System.out.println("ID : 21CE142\nName : Krishna M. Thakor");

	}
}