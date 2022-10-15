package dsa_LinkedList;

public class LinkedlistOperations {
	public static void main(String[]args) {
		Linkedlist list = new Linkedlist();
		list.addAtEnd("two");
		list.addAtEnd("three");
		list.addAtEnd("four");
		list.addAtEnd("five");
		list.display();
		list.addAtBeginning("one");
		System.out.println();
		list.display();
		Node node = list.find("two");
		System.out.println();
		if(node.getData() == "two") {
			System.out.println("Found the element");
		}
		else {
			System.out.println("No elemnt is present");
		}
		list.insert("raj", "two");
		list.display();
		System.out.println();
		list.deleteElement("raj");
		list.display();
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
	
	public void deleteElement(String data) {
		Node node = find(data);
		if(node == this.head) {
			node.setNext(head);
		}
		else if(node == this.tail) {
			node = null;
		}
		Node temp = this.head;
		while(temp != null) {
			if(temp.getNext() == node) {
				Node nodeBefore = temp;
				nodeBefore.setNext(node.getNext());
				node.setNext(null);
			}
			temp = temp.getNext();
		}
	}
	
	public void insert(String data, String dataBefore) {
		Node node = new Node(data);
		Node nodeBefore = find(dataBefore);
		if(nodeBefore != null) {
			node.setNext(nodeBefore.getNext());
			nodeBefore.setNext(node);
			if(node.getNext() == null) {
				this.tail = node;
			}
		}
		else {
			System.out.println("Can't insert the elemnt");
		}
	}
	
	public Node find(String data) {
		Node temp = this.head;
		while(temp != null) {
			if(temp.getData() == data) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}
	
	public void addAtBeginning(String data) {
		Node node = new Node(data);
		if(this.head == null) {
			this.head = this.tail = node;
		}
		else {
			node.setNext(this.head);       //Making the new node to refer to head
			this.head = node;				//Making the new node as head
		}
	}
	
	public void addAtEnd(String data) {
		Node node = new Node(data);    //Create a new node
		if(this.head == null) {        //Check if the node is empty
			this.head = this.tail = node;
		}
		else {
			this.tail.setNext(node);	//Setting the last node to refer the N
			this.tail = node;			//Making the New Node tail
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