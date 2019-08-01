
#include<stdio.h>
int main()
{
  int n,sum=0;
  scanf("%d",&n);
  for(int i=0;i<=n;i++)
  {
    if(isprime(i))
      sum=sum+i;
  }
  printf("%d",sum-1);
  return 0;
}
int isprime(int n)
{
  int temp=0;
  for(int i=2;i<=n/2;i++)
  {
    if(n%i==0)
    {
      temp=1;
    }
  }
  if(temp==0) return 1;
  else return 0;
}
