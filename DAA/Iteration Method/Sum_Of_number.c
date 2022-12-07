#include<stdio.h>
#include<time.h>
void main(){
    int n,s=0;
    clock_t start,end;
    double cpu_time_used;
    printf("Enter N: ");
    scanf("%d",&n);
   

    start = clock();
    for(int i=1;i<=n;i++){
        s=s+i;
    }
    end = clock();
    cpu_time_used = ((double)(end - start))/CLOCKS_PER_SEC;
	printf(" sum = %d \n",s);
    printf(" time = %lf",cpu_time_used);
}