package dsa_Arraylist;

// Given two strings, write a method to decide if one is a permutation of the other. 
/*
 * Like in many questions, we should confirm some details with our interviewer. We should understand if the
permutation comparison is case sensitive. That is: is God a permutation of dog? Additionally, we should
ask if whitespace is significant. We will assume for this problem that the comparison is case sensitive and
whitespace is significant. So, "god " is different from "dog".
Observe first that strings of different lengths cannot be permutations of each other. There are two easy
ways to solve this problem, both of which use this optimization.
Solution #1: Sort the strings.
If two strings are permutations, then we know they have the same characters, but in different orders. Therefore, sorting the strings will put the characters from two permutations in the same order. We just need to
compare the sorted versions of the strings. 
 */

public class IsPermutation {
	public static void main(String[]args) {
		String one = "dog";
		String two = "God";
		boolean res = check(one.toLowerCase(), two.toLowerCase());
		boolean resNew = checkNew(one.toLowerCase(), two.toLowerCase());
		System.out.println(res);
		System.out.println("this is using counting how many time the elemets are and checking whether the same number of elements are presnt");
		System.out.println(resNew);
	}
	
	public static boolean checkNew(String one, String two) {
		if(one.length() != two.length()) {
			return false;
		}
		
		int[] letters = new int[129];
		char[] one_array = one.toCharArray();
		for(char c : one_array) {
			letters[c]++;
		}
		for(int i = 0 ; i < two.length(); i++) {
			int c = (int) two.charAt(i);
			letters[c]--;
			if(letters[c] < 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean check(String one, String two) {
		if(one.length() != two.length()) {
			return false;
		}
		return sortString(one).equals(sortString(two));
	}
	public static String sortString(String word) {
		char[] char_set = word.toCharArray();
		java.util.Arrays.sort(char_set);
		return new String(char_set);
	}
}
