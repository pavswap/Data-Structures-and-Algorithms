#include<stdio.h>
int main()
{
    printf("Enter size of the array\n");
    int n;
    scanf("%d", &n);
    int ar[n];
    for(int i=0;i<n;i++)
    {
        printf("Enter value for index number %d\n", i);
        scanf("%d", &ar[i]);
    }
    
}