import java.util.*;
class fact_rec{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.print("enter n: ");
        int n=sc.nextInt();
        int sum=factorial(n);
        System.out.println(sum);
    }
    public static int factorial(int n){
    if(n==1 || n==0){
        return 1;
    }
    else{
        return n*factorial(n-1);
    }
}
}

