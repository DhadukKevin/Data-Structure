import java.util.*;
class second_gretest_array{
	public static void main(String[] args){
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}
		int max,max1;
		max=a[0];
		max1=a[0];

		for(int j=1;j<5;j++){
			if(max<a[j]){
				max1=max;
				max=a[j];
			}
		}
		System.out.println("second gretest numbers is "+max1);
	}
}