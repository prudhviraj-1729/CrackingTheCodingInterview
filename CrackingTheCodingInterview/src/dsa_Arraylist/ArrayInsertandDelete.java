package dsa_Arraylist;

public class ArrayInsertandDelete {
	public static void main(String[] args) {
		char[] arr = new char[6];
		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
		arr[3] = 'D';
		arr[4] = 'E';
		System.out.println("Before Insertion");
		for(char c : arr) {
			System.out.print(c+" ");
		}
		insertElement(arr, 2 , 'X');
		System.out.println("AFter Insertion");
		for(char c : arr) {
			System.out.print(c+" ");
		}
		deleteElement(arr, 2);
		System.out.println("after Deletion");
		for(char c : arr) {
			System.out.print(c+" ");
		}
		
	}
	public static void deleteElement(char[] arr, int pos) {
		for(int i = pos ; i < arr.length-1 ; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length - 1] = 0;
	}
	public static void insertElement(char[] arr, int pos, char val) {
		for(int i = arr.length - 1 ; i >= pos ; i--) {
			arr[i] = arr[i-1];
		}
		arr[pos] = val;
	}
}
