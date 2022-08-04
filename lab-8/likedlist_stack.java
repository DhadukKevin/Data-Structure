import java.util.*;
class likedlist_stack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		stack stk=new stack();
		while(true){
			System.out.println("Enter 1 for push \nEnter 2 for display \nEnter 3 for pop \nEnter 4 for peek \nEnter 5 for peep");
			int op=sc.nextInt();
			int x,i;
			switch(op){
				case 1:
					System.out.print("enter number to be pushed: ");
					x=sc.nextInt();
					stk.push(x);
					break;

				case 2:
					stk.display();
					break;

				case 3: 
					stk.pop();
					break;

				case 4: 
					System.out.println();
					System.out.println("Top element of stack is: "+stk.peek());
					System.out.println();
					break;

				case 5: 
					System.out.print("enter i'th element which you whould tp display: ");
					i=sc.nextInt();
					System.out.println();
					// System.out.println("Top element of stack is: "+stk.peep(i));
					stk.peep(i);
					System.out.println();
					break;
			}

		}
	}
}
class stack{
	Node head;

	static class Node{
		int value;
		Node next;

		Node(int a){
			value=a;
			next=null;
		}
	}

	public void push(int n){
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

	public int pop(){
		Node lastNode=head;
		Node tail=null;
		if(head==null && tail==null){
			System.out.println("list is empty");
			return 0;
		}
		else{
			while(lastNode.next!=null){
				tail=lastNode;
				lastNode=lastNode.next;
			}
			tail.next=null;
		return tail.value;
		}
	}

	public int peek(){
		Node lastNode=head;
		if(head==null){
			System.out.println("list is empty");
			return 0;
		}
		else{
			while(lastNode.next!=null){
				lastNode=lastNode.next;
			}

		return lastNode.value;
		}
	}

	public void peep(int i){
		Node lastNode=head;
		int count=1;
		if(head==null){
			System.out.println("list is empty");
			return;
		}
		else{

			while(lastNode.next!=null){
				
				count++;
			}
			int[] arr=new int[count];
			for(int j=0;j<count;j++){
				arr[j]=lastNode.next;
			}
			// System.out.println(count);
		}
	}
}