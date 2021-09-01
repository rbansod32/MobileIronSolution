package com.solution.easy.strings;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String input [] = {"flower","flag","float"};
		String output = longestCommonPrefix(input);
		System.out.println("Longest Common Prefix : " + output);
	}
	
	public static String longestCommonPrefix(String[] a) {
        
		String returnStr = "";
		int size = a.length;
		 
        if (size == 0) {
        	return "";
        }else if (size == 1) {
        	return a[0];
        }else {
        	Arrays.sort(a);
        	 
            int end = Math.min(a[0].length(), a[size-1].length());
     
            int i = 0;
            while (i < end && a[0].charAt(i) == a[size-1].charAt(i) )
                i++;
     
            returnStr = a[0].substring(0, i);
        }
       
        return returnStr;
        
    }

}
