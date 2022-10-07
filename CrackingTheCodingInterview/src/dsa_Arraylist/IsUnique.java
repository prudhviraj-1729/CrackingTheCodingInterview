package dsa_Arraylist;

// Implement an algorithm to determine if a string has all unique characters. What if you
//cannot use additional data structures

public class IsUnique {
	public static void main(String[]args) {
		String name = "thomaa";
		boolean res = isUnique(name);
		System.out.println(res);
	}
	public static boolean isUnique(String name) {
		if(name.length() > 128) {
			return false;
		}
		boolean[] char_set = new boolean[128];
		for(int i = 0 ; i < name.length() ; i++) {
			int val = name.charAt(i);
			if(char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
}
//The time complexity for this code isO( n ), where n is the length of the string. 
//The space complexity isO(l ).
/*If we can't use additional data structures, we can do the following:
1. Compare every character of the string to every other character of the string. This will take 0( n
2) time
and 0(1) space.
2. If we are allowed to modify the input string, we could sort the string in O(n log(n)) time and then
linearly check the string for neighboring characters that are identical. Careful, though: many sorting
algorithms take up extra space.
These solutions are not as optimal in some respects, but might be better depending on the constraints of
the problem. 
*/