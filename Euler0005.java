package euler_solutions;

/**
2520 is the smallest number that can be divided by each of the numbers
from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of
the numbers from 1 to 20?
*/

public class Euler0005 {
/** Checks each value above 20 to find the first number that is evenly 
divisible by all of the numbers from 1 to 20*/
	public static int solution(){
		int answer = 0;
		for (int a = 20 ; a > 1 ; a++){
			if (even(a)){
				answer = a;
				break;
			}
		}
		return answer;
	}
/** Returns true if int a is evenly divisble by all the numbers
between 1 and 20.*/
	public static boolean even(int a){
		for (int b = 1 ; b<=20 ; b++){
			if (a%b != 0) return false;
		}
		return true;
	}
}
