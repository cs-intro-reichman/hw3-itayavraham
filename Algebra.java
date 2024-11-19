// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		int sum = x1;
		for(int i = 0; i < x2; i++)
		sum++;
		return sum;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		int sum = x1;
		for(int i = 0; i < x2; i++)
		sum--;
		return sum;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
<<<<<<< HEAD
		int sum = 0;
		if (x1 == 0 || x2 == 0)
=======
		// Replace the following statement with your code
>>>>>>> upstream/main
		return 0;
		for(int i = 0; i < x2; i++)
		sum = plus(sum, x1);
		return sum;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		// case of x^0
		if (n == 0)
		return 1;
		// x^n = x * x * x .... * x n times
		else {
			int sum = x;
			for (int i = 1; i < n; i++)
			{
				sum = times(sum, x);
			}
			return sum;
		}
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
<<<<<<< HEAD
		int sum = x1;
		int counter = 0;
		// Check for the case of both Xs being equal
		if (minus(sum, x2) == 0)
		return 1;
		// Check for the case of the numbers being coprimes, aka a reduced fraction where the number don't divide
		if (minus(sum, x2) < 0)
=======
		// Replace the following statement with your code
>>>>>>> upstream/main
		return 0;
		// Calculations
		while (sum != 0) {
			sum = minus(sum, x2);
			counter++;
			// Checking for the next time in case the numbers don't fully divide
			if (minus(sum, x2) < 0)
			break;
		}
		return counter;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
<<<<<<< HEAD
		int sum = div(x1, x2);
		sum = times(sum, x2);
		sum = minus(x1, sum);
		return sum;
		// Alt Code: return minus(x1, times(div(x1, x2), x2));
=======
		// Replace the following statement with your code
		return 0;
>>>>>>> upstream/main
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
<<<<<<< HEAD
		int oddNumbers = 1, counter = 0, sum =x;
		// Checking for the case of X = 1
		if (x == 1)
		return 1;
		// Calculation Method: OddNumbers Subtraction
		while (sum != 0)
		{
			sum = minus(sum, oddNumbers);
			counter++;
			oddNumbers = plus(oddNumbers, 2);
			if(minus(sum, oddNumbers) < 0)
			break;
		}
		return counter;
=======
		// Replace the following statement with your code
		return 0;
>>>>>>> upstream/main
	}	  	  
}