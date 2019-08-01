#include<stdio.h>

int main()
{
  // Type your code here
  int n=4,a,arr[n],temp=0;
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a);
    arr[i]=a;
  }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n-1;j++)
      {
        if(arr[j]>arr[j+1])
        {
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    printf("%d",arr[0]);
  return 0;
  }