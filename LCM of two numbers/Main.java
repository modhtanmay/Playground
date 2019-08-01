#include<stdio.h>
int main()
{
  //Type your code here
  long int n1,n2,max,lcm,gcd;
  scanf("%ld%ld",&n1,&n2);
  if(n1>n2) max=n1;
  else max=n2;
  for(int i=1;i<max;i++)
  {
    if(n1%i==0 && n2%i==0) 
      gcd=i;
  }
  printf("%ld",(n1*n2)/gcd);
  return 0;
}