#include <stdio.h>
int main() {
	//Type your code
  int n,c=1;
  scanf("%d",&n);
  for(int i=1;i<n*2;i++)
  {
    if(i%2==1)
    {
      printf("%d\n",i);
      c++;
    }
  }
	return 0;
}