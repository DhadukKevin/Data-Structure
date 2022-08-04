import java.util.*;

class list{
	Node head;

	static class Node{
		int value;
		Node next;

		Node(int a){
			value=a;
			next=null;
		}
	}
	public void insert(int n){
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

	public void delete(){
		Node cNode=head,tail=null;
		if(head==null){
			System.out.println("list is empty");
			return;
		}
		else{
			while(cNode.next!=null){
				tail=cNode;
				cNode=cNode.next;
			}
			tail.next=null;
		}
	}

	public void deleteFromFront(){

		if(head==null){
			System.out.println("list is empty");
			return;
		}
		else{
			head=head.next;
		}
	}
}

class linkedList{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		list obj1=new list();
		int x;
		while(true){
			System.out.print("Enter 1 for insert \nEnter 2 for display \nEnter 3 for delete \nEnter 4 for delete from front ");
			int op=sc.nextInt();

			switch(op){
				case 1:
					System.out.print("enter number to be inserted: ");
					x=sc.nextInt();
					obj1.insert(x);
					break;

				case 2:
					obj1.display();
					break;

				case 3:
					obj1.delete();
					break;

				case 4:
					obj1.deleteFromFront();
					break;
			}

		}
	}
}