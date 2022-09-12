import java.util.*;

public class TryCatch
{
	//ID - 21CE142
	//Name - Krishna M. Thakor
	//Aim - WAP to show the try - catch block to catch the different types of exception.
	
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
		
		System.out.println("Outside Try and Catch Block.");
		
		System.out.println();
        System.out.println("ID : 21CE142\nName : Krishna M. Thakor");

	}
}