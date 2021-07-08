import java.util.Scanner;

// Java program for printing the Fibonacci series till 'n' number of range

class Fibonacci {

	// Driver Code
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range for printing Fibonacci series : ");
        int n = sc.nextInt();
		// Function Call
		int num1 = 0, num2 = 1;
        
        int counter = 0;
        
        // Iterate till counter is N
        while (counter < n) {
        
        	// Print the number
        	System.out.print(num1 + " ");
        
        	// Swap
        	int num3 = num2 + num1;
        	num1 = num2;
        	num2 = num3;
        	counter = counter + 1;
        }
        sc.close();
	}
}

// This code is contributed by th3qui85ly (Shivansh Srivastava)
