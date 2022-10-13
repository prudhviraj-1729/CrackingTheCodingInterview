package dsa_Arraylist;

//Leetcode 26: Remove duplicates and return only upto sorted non duplicate elements
/*
 * in-place algorithm is an algorithm which transforms input using 
 * no auxiliary data structure. However, a small amount of extra storage
 *  space is allowed for auxiliary variables. The input is usually overwritten 
 *  by the output as the algorithm executes. An in-place algorithm updates its 
 *  input sequence only through replacement or swapping of elements.
 */

public class RemoveDuplicateSorted {
	public static void main(String[]args) {
		int[] nums = {1,2,3,3,4,5};
		int inplace = 1; 
		for(int i = 1 ; i < nums.length ; i++) {
			if(nums[i] != nums[i-1]) {
				nums[inplace] = nums[i];
				inplace++;
			}
		}
		for(int i = 0 ; i < inplace ; i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
