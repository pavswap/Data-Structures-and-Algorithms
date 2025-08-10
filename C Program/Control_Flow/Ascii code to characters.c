#include<stdio.h>
int main()
{
    printf("Program to print A to Z and a to z\n");
    for(int i=65;i<90;i++)
    {
        printf("%c\n", i);
    }
    for(int j=0;j<=127;j++)
    {
        printf("%c\n", j);
    }
}