#include<stdio.h>
int main()
{
  //Type your code here
  int decnum,rem,quot,i=1;
  int binnum[20];
  scanf("%d",&decnum);
  quot=decnum;
  while(quot!=0)
  {
    binnum[i++]=quot%2;
    quot=quot/2;
  }
  for(int j=i-1;j>0;j--) printf("%d",binnum[j]);
  return 0;
}