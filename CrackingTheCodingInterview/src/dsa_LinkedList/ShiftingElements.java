package dsa_LinkedList;

//Given a linked list, Left and right shift the elements by N number of times.

/*
 * ex : abc -> def -> mno -> xyz    n = 2
 * 		mno -> xyz -> abc -> def
 * ex : n = 3
 * 		def -> mno -> xyz -> abc
 **/

public class ShiftingElements {
	public static void main(String[]args) {
		Linkedlist list = new Linkedlist();
		list.addAtEnd("abc");
		list.addAtEnd("def");
		list.addAtEnd("mno");
		list.addAtEnd("xyz");
		list.display();
//		shiftLeft(list, 2);
//		System.out.println();
//		list.display();
		System.out.println();
		shiftRight(list,3);
		list.display();
	}
	public static void shiftLeft(Linkedlist list, int n) {
		int count = 0;
		Node temp = list.head;
		while(temp != null) {
			count++;
			if(count == n) {
				Node nodeBefore = temp;
				Node node = temp.getNext();
				list.tail.setNext(list.head);
				list.head = node;
				nodeBefore.setNext(null);
				break;
			}
			temp = temp.getNext();
		}
	}
	public static void shiftRight(Linkedlist list, int n) {
		int count = 0;
		Node temp = list.head;
		while(temp != null) {
			count++;
			if(count == n) {
				Node nodeBefore = temp;
				Node node = temp.getNext();
				list.tail.setNext(list.head);
				list.head  = node;
				nodeBefore.setNext(null);
				break;
			}
			temp = temp.getNext();
		}
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
