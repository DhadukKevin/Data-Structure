#include<stdio.h>
#include<time.h>
void main(){
    int x,y;
    printf("Enter X: ");
    scanf("%d",&x);
    printf("Enter Y: ");
    scanf("%d",&y);
    int a=y,b=1;

    clock_t start,end;
    double cpu_time_used;

    start = clock();

    while(a-->0){
        b=b*x;
    }
    printf("%d \n",b);
    end = clock();
    cpu_time_used = ((double)(end - start))/CLOCKS_PER_SEC;
	printf("%lf",cpu_time_used);
    
    
}