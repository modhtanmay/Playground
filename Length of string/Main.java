#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char str[20];
  scanf("%[^\n]s",str);
  printf("%d",strlen(str));
  return 0;
}