#include<stdio.h>
int main()
{
    printf("Enter a Number\n");
    int n;
    scanf("%d", &n);
    int a=0;
    for(int i=n-1;i>=2;i--)
    {
        if(n%i!=0)
        {
            a=a+0;
        }
        else
        {
            a++;
        }
    }
    if(a==0)
    {
        printf("%d is a prime number", n); 
    }
    else
    {
        printf("%d is not a prime number", n); 
    }
}