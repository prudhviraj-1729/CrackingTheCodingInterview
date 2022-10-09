package dsa_Arraylist;

/*
 * One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -> true
pales, pale -> true 
 */

/*
 * Replacement: Consider two strings, such as bale and pale, that are one replacement away. Yes, that
does mean that you could replace a character in bale to make pale. But more precisely, it means that
they are different only in one place.
• Insertion: The strings apple and aple are one insertion away. This means that if you compared the
strings, they would be identical-except for a shift at some point in the strings.
• Removal: The strings apple and aple are also one removal away, since removal is just the inverse of
insertion.
We can go ahead and implement this algorithm now. We'll merge the insertion and removal check into one
step, and check the replacement step separately. 
 */
public class OneEditAway {
	public static void main(String[]args) {
		String wordone = "bale";
		String wordtwo = "pale";
		boolean res = oneEditAway(wordone, wordtwo);
		System.out.println(res);
		boolean resnew = oneEditAway("aple", "apple");
		System.out.println(resnew);
		boolean resnewnew = oneEditAway("apple", "aple");
		System.out.println(resnewnew);
	}
	public static boolean oneEditAway(String wordone, String wordtwo) {
		if(wordone.length() == wordtwo.length()) {
			return oneReplaceAway(wordone, wordtwo);
		}
		else if(wordone.length() + 1 == wordtwo.length()) {
			return oneInsertAway(wordone, wordtwo);
		}
		else if(wordone.length() == wordtwo.length() + 1) {
			return oneInsertAway(wordtwo, wordone);
		}
		return false;
	}
	public static boolean oneReplaceAway(String wordone, String wordtwo) {
		boolean foundDiff = false;
		for(int i = 0 ; i < wordone.length() ; i++) {
			if(wordone.charAt(i) != wordtwo.charAt(i)) {
				if(foundDiff) {
					return false;
				}
				foundDiff = true;
			}
		}
		return true;
	}
	public static boolean oneInsertAway(String wordone, String wordtwo) {
		int index1 = 0;
		int index2 = 0;
		while(index1 < wordone.length() && index2 < wordtwo.length()) {
			if(wordone.charAt(index1) != wordtwo.charAt(index2)) {
				if(index1 != index2) {
					return false;
				}
				index2++;
			}
			else {
				index1++;
				index2++;
			}
		}
		return true;
	}
	
}

//For the first time we are assigning to true; and the next time the if conditino is true we
// are returnning false:
/*
 * boolean var = false;
 *  if(var) --> if this is true
 *    return false;
 *  var = true; --> else if we are assigning it to be true to check for the next time to be false;
*/