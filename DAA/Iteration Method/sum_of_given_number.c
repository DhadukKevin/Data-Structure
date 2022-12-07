#include<stdio.h>
#include<time.h>
void main(){
    int n;
    clock_t start,end;
    double cpu_time_used;
    printf("enter N:");
    scanf("%d",&n);
    int a=n,s,r,sum=0;
    start = clock();
    while(n!=0){
		r=n%10;
		n=n/10;
		sum+=r;
	}
    end = clock();
    printf(" sum = %d \n",sum);
    cpu_time_used = ((double)(end - start))/CLOCKS_PER_SEC;
    printf(" time = %lf",cpu_time_used);
}
