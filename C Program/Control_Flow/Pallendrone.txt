#include<stdio.h>
#include<math.h>
int main()
{
    printf("Enter a number\n");
    int n,k=0,m=0,n2;
    scanf("%d", &n);
    n2=n;
    int n_org=n;
    while(n>0)
    {
        k=n%10;
        n=n/10;
        m++;
    }
    m=pow(10,m);
    int x=0;
    while(n2>0)
    {
        k=n2%10;
        n2=n2/10;
        x=x+k*m;
        m=m/10;
    }
    x=x/10;
    printf("%d\n", x);
    if(n_org==x)
    {
        printf("%d is a Palindrome Number\n", x);
    }
    else
    {
       printf("%d is not a Palindrome Number\n", x); 
    }
}