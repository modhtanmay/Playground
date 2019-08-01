




#include<stdio.h>
int main()
{
  //Type your code here
  int n,f=1,s=2,next;
  scanf("%d",&n);
  for(int i=3;i<=n;i++)
  {
    next=f+s;
    f=s;
    s=next;
  }
  printf("%d",next);
  
}
