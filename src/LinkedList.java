
public class LinkedList {
	//reference to the first Node
	private Node header;
	//Reference to last node
	private Node lastNode;
	//Size of linked List
	private int size;
	
	//constructor implementation
	public LinkedList() {
		//create dummy Node
		header = new Node(null);
		//reference dummy Node
		lastNode = header;
	}
	
	//prepend
	public void prepend(Integer data) {
		Node n = new Node(data);
		if(size == 0) {
			header.next = n;
			lastNode = n;
			size++;
		}
		else {
			//temporary value to save next node
			Node temp = header.next;
			header.next = n;
			n.next = temp;
			size++;
			
		}
	}
	
	//append()
	public void append(Integer data) {
		Node n = new Node(data);
		if(size == 0) {
			header.next = n;
			lastNode = n;
			size++;
		}
		else {
			lastNode.next = n;
			lastNode = n;
			size++;
		}
	}
	
	public int getSize() {
		return size;
	}
	
	//InsertAt 
	public void insertAt(int index, Integer data) {
		if(index <= 0 || index > size)
			return;
		else if(index == 1) 
			prepend(data);
		else if(index == size)
			append(data);
		else {
			Node n = new Node(data);
			Node x = header.next;
			int count = 1;
			while(count != index - 1) {
				x = x.next;
				count++;
			}
			Node temp = x.next;
			x.next = n;
			n.next = temp;
			size++;
		}
		
	}
	public String toString() {
		//reference first node
		Node n = header.next;
		String temp = "";
		while(n != null) {
			temp = temp + n.data + "";
			n = n.next;
		}
		return temp;
	}
	
}
