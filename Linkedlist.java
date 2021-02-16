public class LL {
	Node head;
	Node pointer;
	Node first;
	Node last;

	class Node{
		int data;
		Node next;
		Node prev;
		int position;
		Node(int d) {
			data = d;
			next = null;
			prev = null;
			position = 0;

		}
	}
	public int length() {
		int count =0;
		if(this != null) {
			Node temp = this.head;
			while(temp !=null) {
				count++;
				temp=temp.next;
			}
		}
		return count;
	}

	public int position(Node n) {
		return n.position;
	}
	public Node insertPointer(int d) {
		int count=0;
		for(Node i = this.head;i !=null;i=i.next) {
			count++;
			if( count == d) {
				this.pointer = i;
				return this.pointer;
			}
		}
		return null;
	}
	public LL insert( int d) {
		Node new_node = new Node(d);
		new_node.next=null;
		new_node.prev=null;

		if(this.head == null) {
			this.head =new_node;
			new_node.position =1;
		} else {
			Node last = this.head;
			while(last.next !=null) {
				last = last.next;
			}
			last.next=new_node;
			new_node.prev=last;
			new_node.position = new_node.prev.position++;
		}
		return this;	
	}

	public LL insertAfter(Node pointer, int d) {
		if(this !=null && pointer !=null) {
			Node new_node = new Node(d);
			new_node.next = null;
			new_node.prev= null;

			new_node.next = pointer.next;
			new_node.prev= pointer;
			pointer.next=new_node;
		}
		return this;
	}

	public LL delete(int d) {
		{
			Node temp = this.Search(d);
			if(temp != null) {
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
				temp.next=null;
				temp.prev=null;
				temp = null;
			}
			return this;	
		}
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
		list.insert(41);
		list.insert(3);
		list.insert(0);
		list.insert(18);
		if(list.Search(0) != null) {
			System.out.println("yy");
		}
		list.delete(0);
		System.out.println(list.length());

		list.printList();

	}

}

