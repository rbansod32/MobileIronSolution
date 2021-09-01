package com.solution.easy.Array;

public class TargetSum {
	public static void main(String[] args) {
		
		int inputArray[] = { 3,2,4 };
		int target = 6;
		
		int output [] = sumToFormTarget(inputArray, target);

		System.out.println(output[0] + " " + output[1]);
	}

	public static int [] sumToFormTarget(int[] inputArray, int target) {

		int first = 0;
		int second = 0;
		
		for (int i = 0; i < inputArray.length; i++) {

			for (int j = i + 1; j < inputArray.length; j++) {

				int sum = inputArray[i] + inputArray[j];
				
				if (sum == target) {
					first = i;
					second = j;
					break;
				}

			}

		}

		int returnArr [] = {first, second};
		
		return returnArr;
	}
}
