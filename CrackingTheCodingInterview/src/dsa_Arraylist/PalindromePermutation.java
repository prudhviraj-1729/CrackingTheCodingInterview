package dsa_Arraylist;

/*
 * Implementing this algorithm is fairly straightforward. We use a hash table to count how many times each
character appears. Then, we iterate through the hash table and ensure that no more than one character has
an odd count. 
 */

/*
 * Given a string, write a function to check if it is a permutation of
a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
permutation is a rearrangement of letters. The palindrome does not need to be limited to just
dictionary words.
 */

public class PalindromePermutation {
	public static void main(String[]args) {
		String word = "taco coa";
		boolean res = isPermutationOfPalindrome(word);
		System.out.println(res);
	}
	public static boolean isPermutationOfPalindrome(String word) {
		int[] table = buildCharFrequencyTable(word);
		return checkMaxOneOdd(table);
	}
	public static boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd = false;
		for(int x : table) {
			if(x % 2 == 1) {
				if(foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}
	public static int[] buildCharFrequencyTable(String word) {
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') +1];
		for(char c : word.toCharArray()) {
			int x = getCharValue(c);
			if(x != -1) {
				table[x]++;
			}
		}
		return table;
	}
	public static int getCharValue(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if(a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}
}

//This algorithm takes O ( N) time, where N is the length of the string. 