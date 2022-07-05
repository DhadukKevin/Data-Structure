import java.util.*;
class stack1{
		int[] arr=new int[10];
		int top=-1;
	public void push(int n){
		if(top==10){
			System.out.print("Stack over flow");
		}
		else{
			top++;
			arr[top]=n;
		}
	}
	public int pop(){
		if(top>=0){
			return arr[top--];
		}
		else{
			System.out.print("Stack Underflow");
		}
		return 0;
	}
	public int peep(){
		return arr[top];
	}
	public void change(int i,int n){
		if(top<0){
			System.out.print("Stack Underflow");
		}
		else{
			arr[top-i+1]=n;
		}
	}
	public void display(){
		for(int j=0;j<=top;j++){
			System.out.println(arr[j]);
		}
	}
}
class stackDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		stack1 s=new stack1();
		while(true){
			System.out.println("1 for push \n 2 for peep \n 3 for pop \n 4 for change \n 5 for display");
			int op=sc.nextInt();
			if(op==1){
				System.out.print("enter n: ");
				int n=sc.nextInt();
				s.push(n);
			}
			else if(op==2){
				int out=s.peep();
				System.out.println(out);
			}
			else if(op==3){
				int out=s.pop();
				System.out.println(out);
			}
			else if(op==4){
				System.out.print("enter n: ");
				int n=sc.nextInt();
				System.out.print("enter i: ");
				int i=sc.nextInt();

				s.change(i,n);
			}
			else if(op==5){
				s.display();
			}
		}
}
}

