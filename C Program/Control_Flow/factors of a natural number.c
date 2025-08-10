#include <stdio.h>
#include <math.h>
int main()
{
    int n,a=0,s=0,f=1;
    printf("Enter a Number\n");
    scanf("%d", &n);
    for(int i=1;i<n;i++)
    {
        if(n%i==0)
        {
            printf("%d , ", i);
        }
    }
    printf("%d are the factors of %d", n, n);
}
