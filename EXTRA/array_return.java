		import java.util.*;
		class array_return{
			public static void main(String[] args){
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				
				System.out.println("returned value is: "+value(n));

			}
			public static int value(int n){
					Scanner sc=new Scanner(System.in);
					int[] a=new int[n];
						
					for(int i=0;i<n;i++){
						a[i]=sc.nextInt();
					}
					int temp;
					int b=0;
					boolean flag=false;
					temp=a[0];
					int count=1;
					for(int i=0;i<n-1;i++){
						if(a[0]>a[i+1]){
							b=1;
						}
						else{
							b=0;
						}
					}
					if(b==0){
						for(int j=1;j<n;j++){

						if(temp==a[j]){
							count++;
						}
						else if(count>=3){
							temp=a[j];
							count=1;
						}
						else {
							flag=true;
						}
				}

				if(flag){
					return 0;
				}
				else{
					return 1;
				}
					}
					else{
						return 0;
					}
		}
		}