import java.util.*;
class String_Check{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter String in only ab form: ");
		String s=sc.nextLine();
		int flag=0;
		int count_a=0;
		int count_b=0;

		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'){
				count_a++;
			}
			else if(s.charAt(i)=='b'){
				count_b++;
			}
			else{
				System.out.print("invalid string");
				flag=1;
			}
		}
		if(flag==0){
			if(count_a==count_b){
				System.out.print(s+" String is valid");
			}
			else{
				System.out.print(s+" string not valid");
			}
		}
		
	}
}