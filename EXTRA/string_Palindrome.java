import java.util.*;
class string_Palindrome{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.nextLine();


	}
	public void push(String s){
		if(top==s.length()){
			System.out.print("Stack over flow");
		}
		else{
			top++;
			arr[top]=;
		}
		for(int i=0;i<s.length();i++){
			if(top==s.length()){
				System.out.print("Stack over flow");
			}
			else{
				top++;
				arr[top]=;
			}
		}
	}
}