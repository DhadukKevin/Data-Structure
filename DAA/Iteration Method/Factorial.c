#include<stdio.h>
#include<time.h>
void main(){
    int n,fact=1;
    clock_t start,end;
    double cpu_time_used;
    printf("Enter N: ");
    scanf("%d",&n);

    start = clock();
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    end = clock();
    cpu_time_used = ((double)(end - start))/CLOCKS_PER_SEC;
	printf(" fact = %d \n",fact);
    printf(" time = %lf",cpu_time_used);
    
}