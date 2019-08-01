#include<stdio.h>
int main()
{
  //Type your code here
  int n,pos=0;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  int find;
  scanf("%d",&find);
  for(int i=0;i<n;i++)
  {
     if(arr[i]==find)
       pos=i;
  }
  if(pos==0) printf("%d isn\'t present in the array.",find);
  else printf("%d",pos+1);
  return 0;
}