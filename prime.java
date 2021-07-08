// A Naive method based Java program to
// check if a number is prime
import java.util.*;

class Prime {

	// Check for number prime or not
	static boolean isPrime(int n)
	{

		// Check if number is less than
		// equal to 1
		if (n <= 1)
			return false;

		// Check if number is 2
		else if (n == 2)
			return true;

		// Check if n is a multiple of 2
		else if (n % 2 == 0)
			return false;

		// If not, then just check the odds
		for (int i = 3; i <= Math.sqrt(n); i += 2)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// Driver code
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
		if (isPrime(a))
			System.out.println(a + " is Prime Number...");

		else
			System.out.println(a+ " is not a Prime Number...");
        sc.close();
	}
}

// This code is contributed by th3qui85ly (Shivansh Srivastava)
