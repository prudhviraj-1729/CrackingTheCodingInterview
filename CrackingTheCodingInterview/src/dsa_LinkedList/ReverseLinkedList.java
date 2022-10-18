package dsa_LinkedList;

//Write a program to Reverse a linked list

/*
 * ex: data structures and algos 	Output: algos and structures data
 */

public class ReverseLinkedList {
	public static void main(String[]args) {
		Linkedlist list = new Linkedlist();
		list.addAtEnd("data");
		list.addAtEnd("structures");
		list.addAtEnd("and");
		list.addAtEnd("algos");
		list.display();
		reverseList(list);
		System.out.println();
		System.out.println("After Reverse");
		list.display();
	}
	
	public static void reverseList(Linkedlist list) {
		Node prev = null;
		Node curr = list.head;
		Node next = null;
		while(curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		list.head = prev;
	}
}

class Linkedlist{
	Node head;
	Node tail;
	
	public void display() {
		Node temp = this.head;
		while(temp != null) {
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		}
	}
	
	public void addAtEnd(String data) {
		Node node = new Node(data);
		if(this.head == null) {
			this.head = this.tail = node;
		}
		else {
			this.tail.setNext(node);
			this.tail = node;
		}
	}
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	
}

class Node{
	String data;
	Node next;
	
	public Node(String data) {
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
