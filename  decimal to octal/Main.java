#include<stdio.h>
int main()
{
  //type your code here
  int decnum,i=1,j,quot;
  int octalnum[20];
  scanf("%d",&decnum);
  quot=decnum;
  
  while(quot!=0)
  {
    octalnum[i++]=quot%8;
    quot=quot/8;
  }
  for(j=i-1;j>0;j--) printf("%d",octalnum[j]);
  return 0;
}