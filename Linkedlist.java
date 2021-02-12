public class LL {
	Node head;
	Node pointer;

	class Node{
		int data;
		Node next;
		Node prev;
		Node(int d) {
			data = d;
			next = null;
			prev = null;

		}
	}

	public LL insert( int d) {
		Node new_node = new Node(d);
		new_node.next=null;
		new_node.prev=null;

		if(this.head == null) {
			this.head =new_node;
		} else {
			Node last = this.head;
			while(last.next !=null) {
				last = last.next;
			}
			last.next=new_node;
			new_node.prev=last;
		}
		return this;	
	}

	public void printList() {
		if(this != null) {
			Node temp= this.head;
			while(temp !=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}	
	}

	public Node Search(int d) {
		Node temp = this.head;
		while( temp != null) {
			if(temp.data == d) {return temp;}
			temp=temp.next;
		}
		return null;	
	}


	public static void main(String[] args) {
		LL list = new LL();

		list.insert(4);
		if(list.Search(0) != null) {
			System.out.println("yy");
		}

		list.printList();

	}

}

