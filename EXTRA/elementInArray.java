import java.util.*;
class elementInArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr={15,4,1,25,14,85,45,26,89,0,36,97,25,66,44,77,33,22,99,88};

		
		System.out.print("enter element: ");
		int n=sc.nextInt();

		System.out.print(check(arr,n));	
	}

	public static boolean check(int arr[],int n){
		boolean flag=false;
		if(arr[0]==n)
		{
			flag=true;
			return flag;
		}
		else if(arr.length!=1){
			int[] b = new int[arr.length-1];
			for(int j=0;j<b.length;j++)
			{
				b[j]=arr[j+1];

			}
			flag = check(b,n);
		}
		else
		{
			return flag;
		}
		return flag;
	}
}