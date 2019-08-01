#include <stdio.h>
#include <math.h>
int main() {
	//Type your code here
  int n,f,s;
  scanf("%d",&n);
  if(n%2==1)
  {
    f=1;
    s=2;
    int temp=(n+1)/2;
    printf("%d",(int)pow(2,temp-1));
  }
  if(n%2==0)
  {
    f=1;
    s=3;
    int temp=n/2;
    printf("%d",(int)pow(3,temp-1));
  }
	return 0;
}