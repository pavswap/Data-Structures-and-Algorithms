#include<stdio.h>
#include <math.h>
int main()
{
    int sum=0,num=0;
    for(int i=0;i<1000;i++)
    {
        num=i;
        if(i<=9)
        {
            printf("%d\n", i);
        }
        else
        {
            sum= pow(num % 10, 3) + pow((num % 100 - num % 10) / 10, 3) + pow((num % 1000 - num % 100) / 100, 3);
            if (sum == i)
            {
                printf("%d \n", i);
            }
    }
}
}