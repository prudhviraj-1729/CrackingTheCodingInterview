package dsa_Arraylist;
import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers nums and an integer target, return indices of the two 
 * numbers such that they add up to target.
 * 
 * time complexity for optimal solution = O(N);
 * for Brute Force Solution = O(N^2);
 */

public class TwoSum {
	public static void main(String[]args) {
		int[] arr = {3,3};
		int target = 6;
		int[] resbrute = findSumBruteForce(arr, target);
		System.out.println("["+resbrute[0]+ "," + resbrute[1]+"]");
		System.out.println("this is using Optimal Solution:");
		int[] res = findSum(arr, target);
		System.out.println("["+res[0]+ "," + res[1]+"]");
	}
	public static int[] findSum(int[] nums, int target) {
		int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < nums.length; i++){
        	if(map.containsKey(target - nums[i])){
        		res[1] = i;
        		res[0] = map.get(target - nums[i]);
        		return res;
        	}
            map.put(nums[i], i);
        }
        return res;
	}
	public static int[] findSumBruteForce(int[] arr, int target) {
		int res[] = new int[2];
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = i + 1; j < arr.length ; j++) {
				if(arr[i] + arr[j] == target) {
					res[0] = i;
					res[1] = j;
					return res;
				}
			}
		}
		return res;
	}
}
