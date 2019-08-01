// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int n;
  scanf("%d",&n);
  if(n==0)
    printf("neither");
  else
  {
  	if(isprime(n))
    	printf("prime");
    else
      printf("composite");
  }
   return 0;
}
int isprime(int n)
{
	int temp=0;
  for(int i=2;i<=n/2;i++)
  {
    if(n%i==0)
      temp=1;
  }
  if(temp==0)
    return 1;
  else
    return 0;
}
