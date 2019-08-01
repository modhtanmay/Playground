#include<stdio.h>
int main()
{
  //Type your code here
  int n,f=0,s=1;
  scanf("%d",&n);
  printf("%d %d ",f,s);
  for(int i=2;i<n;i++)
  {
    int next=f+s;
    f=s;
    s=next;
    printf("%d ",next);
  }
  return 0;
}