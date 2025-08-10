 #include<stdio.h>
 int main()
 {
    printf("Enter the size of an array\n");
    int n,s=0;
    scanf("%d", &n);
    int arr[n];
    for(int i=0;i<n;i++)
    {
      printf("Enter elements in the array\n");  
      scanf("%d", &arr[i]);
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      if(arr[i]==arr[j])
      {
        s++;
      }
      printf("%d has %d duplicates\n", arr[i], s);
      s=0;
    }
 }