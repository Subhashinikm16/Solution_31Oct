package Oct31Test;

public class LinkedListGreater {
	private Node head=null;
	private Node tail=null;
	class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value=value;
			this.next=null;
		}
	}
	private void addNode(int value) {
		Node newNode=new Node(value);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	private void Arrange()
    {
        Node current = head;
        Node nextValue= null;
        int temp;
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
            	nextValue = current.next;
                int max=current.value;
                int flag=0;
               // System.out.println("max"+max);
                while (nextValue!= null) {
                    if (current.value<nextValue.value) {
                        current.value= nextValue.value;
                        flag=1;
                        break;
                    }
                    nextValue=nextValue.next;
                }
                if(flag==0) {
                	current.value=0;
                }
                current = current.next;
            }
        }
    }
	private void display()
    {
        Node current = head;
        if (head == null) {
            System.out.println("List empty");
            return;
        }
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListGreater sList=new LinkedListGreater();
        sList.addNode(6);
        sList.addNode(90);
        sList.addNode(0);
        sList.addNode(5);
        sList.addNode(70);
        sList.addNode(800);
        sList.display();
        sList.Arrange();
        System.out.println("Sorted list: ");
        sList.display();
	}
}
