package com.solution.medium.stringsArray;

public class LongestPalSubstring {
	public static void main(String[] args) {
		String input = "cbbd";
		System.out.println("Input String : " + input);
		String output = longestPalSubstr(input);
		System.out.println("Longest Palindrome Substring : " + output);
	}

	static String longestPalSubstr(String str) {
		String returnStr = "";

		int maxLength = 1, start = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				int flag = 1;

				for (int k = 0; k < (j - i + 1) / 2; k++)
					if (str.charAt(i + k) != str.charAt(j - k))
						flag = 0;

				if (flag != 0 && (j - i + 1) > maxLength) {
					start = i;
					maxLength = j - i + 1;
				}
			}
		}

		returnStr = getSubStr(str, start, start + maxLength - 1);

		return returnStr;
	}

	static String getSubStr(String str, int low, int high) {
		String returnStr = "";
		for (int i = low; i <= high; ++i)
			returnStr += str.charAt(i);

		return returnStr;
	}
}
