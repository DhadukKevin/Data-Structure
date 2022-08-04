import java.util.*;
class linkedlist_queue{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		queue q=new queue();
		while(true){
			System.out.print("1 for insert \n2 for dlt \n3 for display\n");
			int op=sc.nextInt();
			switch(op){
				case 1:
					System.out.println();
					System.out.print("enter element to be inserted: ");
					int n=sc.nextInt();		
					q.enqueue(n);
					break;

				case 2:
					q.dlt();
					break;

				case 3:
					q.display();
					break;
			}
		}

	}
}
class queue{
	Node head;

	static class Node{
		int value;
		Node next;

		Node(int a){
			value=a;
			next=null;
		}
	}

	public void enqueue(int n){
		Node nNode=new Node(n);
		if(head==null){
			head=nNode;
		}
		else{
			Node lastNode=head;

			while(lastNode.next!=null){
				lastNode=lastNode.next;
			}
			lastNode.next=nNode;
		}
	}

	public void display(){
		Node lastNode=head;
		if(head==null){
			System.out.println("list is empty");
			return; 
		}
		else{
			System.out.println();
			System.out.print("Nodes of linked list: ");  
			while(lastNode.next!=null){
				System.out.print("["+lastNode.value+"] ");
				lastNode=lastNode.next;
			}
			System.out.println("["+lastNode.value+"] ");
			System.out.println();
			
		}
	}

	public void dlt(){
		head=head.next;
	}
}