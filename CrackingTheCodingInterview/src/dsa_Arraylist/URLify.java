package dsa_Arraylist;

/*
 * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: if implementing in Java, please use a character array so that you can
perform this operation in place.) 
 */

public class URLify {
	public static void main(String[]args) {
		char[] name = {'m','r',' ','r','a','j',' ',' '};
		int trueLengthOfName = 6;
		String res = replaceSpaces(name,trueLengthOfName);
		System.out.println(res);
	}
	
	public static String replaceSpaces(char[] name,int trueLength) {
		int spaces = 0;
		for(int i = 0 ; i < trueLength ; i++) {
			if(name[i] == ' ') {
				spaces++;
			}
		}
		int index = trueLength + spaces * 2;
		for(int i = trueLength-1 ; i >= 0 ; i--) {
			if(name[i] == ' ') {
				name[index-1] = '0';
				name[index-2] = '2';
				name[index-3] = '%';
				index = index - 3;
			}
			else {
				name[index - 1] = name[i];
				index--;
			}
		}
		return new String(name);
	}
}
