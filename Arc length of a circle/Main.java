#include <stdio.h>
int main()
{
  float r,deg;
  scanf("%f %f",&r,&deg);
  printf("%.2f",((deg/360)*2*3.14*r));

}