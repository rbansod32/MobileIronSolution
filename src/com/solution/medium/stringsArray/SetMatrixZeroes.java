package com.solution.medium.stringsArray;

public class SetMatrixZeroes {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		System.out.println("Input Matrix");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		int[][] inputMatrix = setZeroes(matrix);

		System.out.println("Output Matrix");
		for (int i = 0; i < inputMatrix.length; i++) {
			for (int j = 0; j < inputMatrix[i].length; j++) {
				System.out.print(inputMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int[][] setZeroes(int[][] matrix) {

		int rowPos = 0;
		int colPos = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					rowPos = i;
					colPos = j;

					setRowZero(matrix, rowPos);
					setColumnZero(matrix, colPos);
				}
			}
		}

		return matrix;
	}

	private static void setRowZero(int[][] matrix, int row) {
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
		}
	}

	private static void setColumnZero(int[][] matrix, int column) {
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[i][column] = 0;
		}
	}

}
