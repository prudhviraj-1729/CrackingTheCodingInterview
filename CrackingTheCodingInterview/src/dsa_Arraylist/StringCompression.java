package dsa_Arraylist;

/*
 * String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z)
 */



public class StringCompression {
	public static void main(String[]args) {
		String word = "aaabbccccddd";
		String compressed = compressString(word);
		System.out.println(compressed);
	}
	public static String compressString(String word) {
		StringBuilder compressedString = new StringBuilder();
		int countConsecutive = 0;
		for(int i = 0 ; i < word.length() ; i++) {
			countConsecutive++;
			if(i+1 >= word.length() || word.charAt(i) != word.charAt(i+1)) {
				compressedString.append(word.charAt(i));
				compressedString.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressedString.length() < word.length() ? compressedString.toString() : word ;
	}
}
