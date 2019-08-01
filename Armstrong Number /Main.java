#include <stdio.h>
#include <math.h> 
int main() {
	//Type your code
  int n,r=0,sum,real;
  scanf("%d",&n);
  real=n;
  while(n!=0)
  {
    r=n%10;
    sum=sum+pow(r,3);
    n=n/10;
  }
  //printf("%d",sum);
  if(sum==real)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}