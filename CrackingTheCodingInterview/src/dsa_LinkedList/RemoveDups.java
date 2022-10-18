package dsa_LinkedList;

import java.util.HashSet;

public class RemoveDups {
	public static void main(String[]args) {
		Linkedlist list = new Linkedlist();
		list.addAtEnd("one");
		list.addAtEnd("two");
		list.addAtEnd("three");
		list.addAtEnd("one");
		list.display();
		Linkedlist listnew = list;
		System.out.println("\nAfter removing Duplicates");
		removeDuplicates(list);
		list.display();
		System.out.println("\n If no buffer is allowed");
		removeDuplicatesNoBuffer(listnew);
		listnew.display();
	}
	public static void removeDuplicatesNoBuffer(Linkedlist list) {
		Node curr = list.head;
		while(curr != null) {
			Node runner = curr;
			while(runner.next != null) {
				if(runner.next.data == curr.data) {				//O(N^2) time complexity
					runner.next = runner.next.next;
				}
				else {
					runner = runner.next;
				}
			}
			curr = curr.next;
		}
	}
	public static void removeDuplicates(Linkedlist list) {
		HashSet<String> set = new HashSet<String>();
		Node previous = null;
		Node temp = list.head;
		while(temp != null) {
			if(set.contains(temp.data)) {
				previous.next = temp.next;
			}													//O(N) time complexity
			else {
				set.add(temp.data);
				previous = temp;
			}
			temp = temp.getNext();
		}
	}
}
