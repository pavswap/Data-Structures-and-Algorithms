#include<stdio.h>
int main()
{
  int n;
  printf("Enter n\n");
  scanf("%d", &n);
  int s=0, a=0, b=1;
  for(int i=1;i<n;i++)
  {
    printf("%d\n", a);
    s=a+b;
    a=b;
    b=s;
  }
}