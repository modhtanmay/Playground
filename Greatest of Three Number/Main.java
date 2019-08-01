#include <stdio.h>

int main()
{ 
    // type your code here
  int n1,n2,n3;
  scanf("%d,%d,%d",&n1,&n2,&n3);
  if(n1>n2 && n1>n3) printf("%d",n1);
  else if(n2>n3 && n2>n1) printf("%d",n2);
  else printf("%d",n3);
}