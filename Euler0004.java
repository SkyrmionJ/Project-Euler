package euler_solutions;

import java.util.Collections;
import java.util.HashSet;

/**
A palindromic number reads the same both ways. The largest palindrome made
from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class Euler0004 {
/** Finds the max of all possible palindromes made from the product of two 3-digit numbers.*/
	public static int solution(){
		HashSet<Integer> palin = new HashSet<Integer>();
		for (int a = 999; a>1 ; a--){
			int c = 0;
			for (int b = 999; b>1 ; b--){
				c=a*b;
				if (isPalindrome(Integer.toString(c))) palin.add(c);
			}
		}
		return Collections.max(palin);
	}

/** Return true if String s is a palindrome*/
    public static boolean isPalindrome(String s) {
    	assert s != null;
    	if (s.length()<=1) return true;
    	for (int i = 0; i < s.length(); i++){
    		if (s.charAt(i) != s.charAt(s.length()-1-i)) return false;
    	}
    	return true;
    }
}