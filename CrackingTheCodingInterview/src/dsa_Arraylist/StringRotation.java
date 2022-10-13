package dsa_Arraylist;

public class StringRotation {
	public static void main(String[]args) {
		String one = "waterbottle";
		String two = "erbottlewat";
		boolean res = isRotation(one, two);
		System.out.println(res);
	}
	public static boolean isRotation(String one, String two) {
		int len = one.length();
		if(len == two.length() && len > 0) {
			String word = one + one;
//			return isSubstring(word, two);
		}
		return false;
	}
//	public static boolean isSubstring(String one, String two) {
//		
//	}
}
