#include <stdio.h>
int main() {
  //Type your code
  int n,r,sum=0;
  scanf("%d",&n);
  int original_num=n;
  while(n!=0)
  {
    r=n%10;
    sum=sum+fact(r);
    n=n/10;
  }
  if(sum==original_num)
    printf("Yes");
  else
    printf("No");
	return 0;
}
int fact(int n)
{
  int f=1;
  for(int i=1;i<=n;i++)
  {
    f=f*i;
  }
  return f;
}