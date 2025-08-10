#include<stdio.h>
int main()
{
    printf("enter n\n");
    int n,a=1;
    scanf("%d", &n);
    for(int i=1;i<=10;i++)
    {
        a=n*i;
        printf("%d * %d = %d\n", n, i, a);
    }
}