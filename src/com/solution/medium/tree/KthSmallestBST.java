package com.solution.medium.tree;

import java.util.concurrent.atomic.AtomicInteger;

public class KthSmallestBST {
	static class Node {
		int data;
		Node left = null, right = null;

		Node(int data) {
			this.data = data;
		}
	}

	public static Node insert(Node root, int key) {
		if (root == null) {
			return new Node(key);
		}

		if (key < root.data) {
			root.left = insert(root.left, key);
		}

		else {
			root.right = insert(root.right, key);
		}

		return root;
	}

	public static int kthSmallest(Node root, AtomicInteger i, int k) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}

		int left = kthSmallest(root.left, i, k);

		if (left != Integer.MAX_VALUE) {
			return left;
		}

		if (i.incrementAndGet() == k) {
			return root.data;
		}

		return kthSmallest(root.right, i, k);
	}

	public static int kthSmallest(Node root, int k) {
		AtomicInteger i = new AtomicInteger(0);

		return kthSmallest(root, i, k);
	}

	public static void main(String[] args) {
		int[] keys = { 15, 10, 20, 8, 12, 16, 25 };

		Node root = null;
		for (int key : keys) {
			root = insert(root, key);
		}

		int k = 2;
		int result = kthSmallest(root, k);

		if (result != Integer.MAX_VALUE) {
			System.out.print(result);
		} else {
			System.out.print("Invalid Input");
		}
	}
}
