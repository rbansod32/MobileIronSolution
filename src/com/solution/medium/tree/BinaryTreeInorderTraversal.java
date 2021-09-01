package com.solution.medium.tree;

public class BinaryTreeInorderTraversal {
	
	static class Node {
		String data;
		Node left, right;

		Node(String value) {
			this.data = value;
			left = right = null;
		}

	}

	Node root;

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.printf("%s ", node.data);
		inOrder(node.right);
	}

	public static BinaryTreeInorderTraversal create() {
		BinaryTreeInorderTraversal tree = new BinaryTreeInorderTraversal();
		
		Node root = new Node("40");
		
		tree.root = root;
		tree.root.left = new Node("20");
		tree.root.left.left = new Node("10");
		tree.root.left.left.left = new Node("5");

		tree.root.left.right = new Node("30");
		tree.root.right = new Node("50");
		tree.root.right.right = new Node("60");
		tree.root.left.right.left = new Node("67");
		tree.root.left.right.right = new Node("78");

		return tree;
	}
	
	public static void main(String[] args) throws Exception {

		BinaryTreeInorderTraversal bt = BinaryTreeInorderTraversal.create();

	    System.out.println("printing nodes of binary tree on InOrder");

	    bt.inOrder();
	  }
	
}
