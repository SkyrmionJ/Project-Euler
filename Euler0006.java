package euler_solutions;

/**
The sum of the squares of the first ten natural numbers is,

               1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,

            (1 + 2 + ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten
natural numbers and the square of the sum is 3025 - 385 = 2640.

Find the difference between the sum of the squares of the first one
hundred natural numbers and the square of the sum.
*/

public class Euler0006 {
/** Calculates the sum of the squares and the square of the sum of the first 100 natural numbers.*/
	public static int solution(){
		int sumsq = 0;
		int sqsum = 0;
		for (int a=1 ; a <= 100 ; a++){
			int a2 = a*a;
			sumsq += a2;
			sqsum += a;
		}
		sqsum = sqsum * sqsum;
		return sqsum - sumsq;
	}
}
