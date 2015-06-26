package euler_solutions;
import java.util.ArrayList;

/**
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

public class Euler0003 {
/** Let long n be the number in which you are trying to find the largest prime factor. */
	public static Long solution(Long n){
		ArrayList<Long> primes = new ArrayList<Long>();
		long d = 2;
		while (n >= d){
			while (n % d == 0){
				primes.add(d);
			    n /= d;
			}
			d = d + 1;
		}
		return primes.get(primes.size()-1);
	}
}
