// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int n1,n2,num,gcd=0;
  scanf("%d %d",&n1,&n2);
  if(n1>n2) num=n1;
  else num=n2;
  for(int i=1;i<=num;i++)
    if(n1%i==0 && n2%i==0) gcd=i;
  printf("%d",gcd);
   return 0;
}