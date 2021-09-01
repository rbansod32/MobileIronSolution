package com.solution.medium.stringsArray;

import java.util.ArrayList;
import java.util.List;

public class TripletSum {

	public static void main(String[] args) {
		
		int [] inputArr = {-1,0,1,2,-1,-4};
		
		List<List<Integer>> outputList = threeIntSum(inputArr);
		
		for(List<Integer> tmp : outputList) {
			System.out.println(tmp.get(0) + " " + tmp.get(1) + " " + tmp.get(2));
		}
		
	}
	
	public static List<List<Integer>> threeIntSum(int[] nums) {
	
		List<List<Integer>> returnList = new ArrayList<List<Integer>>();
		
		for (int i = 0; i < nums.length; i++) {
			
			int first = nums[i];
			
			for (int j = i + 1; j < nums.length; j++) {
				
				int second = nums[j];
				
				for (int k = j + 1; k < nums.length; k++) {

					int third = nums[k];
					
					int sum = first + second + third;
					
					if(sum == 0) {
						
						List<Integer> tmpList = new ArrayList<Integer>();
						
						tmpList.add(first);
						tmpList.add(second);
						tmpList.add(third);
						
						returnList.add(tmpList);
					}
					
				}
				
			}
			
		}
		
		return returnList;
    }

}
