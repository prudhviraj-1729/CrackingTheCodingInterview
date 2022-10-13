package dsa_Arraylist;

public class RemoveSpecificElementsSorted {
	public static void main(String[]args) {
		int[] nums = {1,1,1,2,2,3};
		int inplace = 2;
		int[] numsnew = new int[]{1,2,3,4};
		if(contaisDuplicates(numsnew) == false) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
//		for(int i = 2 ; i < nums.length ; i++) {
//			if(nums[i] == nums[i-2]) {
//				inplace = i+2;
//				nums[inplace] = nums[inplace+1];
//			}
//			inplace++;
//		}
//		for(int i = 0 ; i < inplace ; i++) {
//			System.out.print(nums[i]+" ");
//		}
	}
	public static boolean contaisDuplicates(int[] nums) {
		boolean[] res = new boolean[nums.length];
        for(int i = 0 ; i < nums.length ; i++) {
        	if(res[i]) {
        		return false;
        	}
        	res[i] = true;
        }
        return true;
	}
}
