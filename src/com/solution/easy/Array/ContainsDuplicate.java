package com.solution.easy.Array;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int inputArray[] = {1,1,1,3,3,4,3,2,4,2 };

		boolean output = containsDuplicate(inputArray);

		System.out.println(output);
	}

	public static boolean containsDuplicate(int[] nums) {

		boolean duplicate = false;

		for (int i = 0; i < nums.length; i++) {

			for (int j = i+1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {
					duplicate = true;
					break;
				}

			}

		}

		return duplicate;
	}

}
