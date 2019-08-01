#include<stdio.h>
int main()
{
	//type your code here
  int n;
  scanf("%d",&n);
  if(n%2==0)
  {
    printf("%d",(n/2)-1);
  }
  if(n%2==1)
  {
    printf("%d",(n/2)*2);
  }
	
}