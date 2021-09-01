package com.solution.easy.strings;

public class ReverseString {

	public static void main(String[] args) {
		String input = "Sandip";
		System.out.println("Input String : " + input);
		String output = reverseString(input.toCharArray());
		System.out.println("Reverse String : " + output);
	}

	private static String reverseString(char[] s) {

		int i = 0;
		int j = s.length - 1;

		while (i < j) {
			swap(s, i, j);
			i++;
			j--;
		}
		
		return new String(s);

	}

	private static void swap(char[] s, int i, int j) {
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}

}
