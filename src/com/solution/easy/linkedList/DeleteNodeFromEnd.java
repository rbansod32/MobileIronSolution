package com.solution.easy.linkedList;

public class DeleteNodeFromEnd {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void deleteNode(int key) {

		Node first = head;

		Node second = head;
		for (int i = 0; i < key; i++) {

			if (second.next == null) {

				if (i == key - 1)
					head = head.next;
				return;
			}
			second = second.next;
		}

		while (second.next != null) {
			first = first.next;
			second = second.next;
		}

		first.next = first.next.next;
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	public static void main(String[] args) {
		DeleteNodeFromEnd list = new DeleteNodeFromEnd();

		list.push(7);
		list.push(1);
		list.push(3);
		list.push(2);

		System.out.println("Created Linked list is:");
		list.printList();

		list.deleteNode(3);

		System.out.println("\nLinked List after Deletion is:");
		list.printList();
	}
}
