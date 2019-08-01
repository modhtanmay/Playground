#include<stdio.h>
#include<math.h>
int main()
{
  //type your code here
  int n;
  scanf("%d",&n);
  if(n%2==0)
    printf("%d",(int)pow(3,n/2-1));
  if(n%2==1)
    printf("%d",(int)pow(2,n/2));
  return 0;
}