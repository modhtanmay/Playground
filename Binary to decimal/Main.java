#include<stdio.h>
int main()
{
  //Type your code here
  int binnum,decnum=0,i=1,rem;
  scanf("%d",&binnum);
  while(binnum!=0)
  {
    rem = binnum%10;
    decnum = decnum + rem * i;
    i=i*2;
    binnum=binnum/10;
  }
  printf("%d",decnum);
  return 0;
}