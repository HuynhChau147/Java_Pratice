import java.util.Locale;
import java.util.Scanner;

public class B13 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Input the number you want to check : ");
	int a = input.nextInt();
	if(PrimeNumber(a))
	{
		System.out.println(a + " is a prime number");
	}
	else
	{
		System.out.println(a + " is not a prime number");
	}
	
}

	private static boolean PrimeNumber(int a) {
		if(a <= 1)
		{
			return false;
		}
		for(int i = 2;i<=Math.sqrt(a);i++)
		{
			if(a % i ==0)
			{
				return false;
			}
		}
		return true;
	}
}
