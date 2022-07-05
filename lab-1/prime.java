import java.util.*;
class prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.print("not prime number");
        }
        else{
            System.out.print(" prime number");
        }
    }
}