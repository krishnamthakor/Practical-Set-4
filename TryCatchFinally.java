import java.util.Scanner;

public class TryCatchFinally
{
	//ID - 21CE142
	//Name - Krishna M. Thakor
	//Aim - Write a program that raises two exceptions. Specify two ‘catch’ clauses for the two exceptions. Each ‘catch’ block handles a different type of exception. For example the exception could be ‘ArithmeticException’ and ‘ArrayIndexOutOfBoundsException’.Display a message in the ‘finally’ block.

	public static void main(String args[])
	{
		try
		{
			Scanner sobj = new Scanner(System.in);
			System.out.print("Enter Number 1 : ");
			int a = sobj.nextInt();
			System.out.print("Enter Number 2 : ");
			int b = sobj.nextInt();
			int c = a/b;
			
			int Array[] = {5,10};
			Array[10] = 60;
		}
			
		catch(ArithmeticException e)
		{
			System.out.println("Divide by 0! ");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out of Bound!");
		}
		
		finally
		{
			System.out.println("Inside Finally Block.");
		}
		
		System.out.println("Outside Try, Catch and Finally Block.");
		
		System.out.println();
        System.out.println("ID : 21CE142\nName : Krishna M. Thakor");

	}
}