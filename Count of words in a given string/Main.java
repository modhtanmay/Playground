#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char str[100];
  int c=0;
  scanf("%[^\n]s", str);
  for(int i=0; str[i]!='\0';i++)
  {
  	if(str[i]==' ') 
      c++;
  }
  printf("%d",c+1);
}