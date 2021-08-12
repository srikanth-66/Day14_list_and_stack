package StackClass;

public class UC4 {
	Node head;

	//adding queue element
	public void addNode(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	//queue printing
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("");
	}

	//deleting element 
		public void deleteHead() {
			System.out.println("deleting head ");
			Node temp=head;
			if(temp!=null) {
				head=temp.next;
			}
		}
}

