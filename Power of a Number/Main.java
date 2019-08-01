#include <stdio.h>
#include <math.h>
int main()
{
  	//Your code here
  int base,expo;
  scanf("%d %d",&base,&expo);
  if(expo<0) printf("Wrong input");
  else printf("%d",(int)pow(base,expo));
  
    return 0;
}