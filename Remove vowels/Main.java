#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
  int length=strlen(str);
  //Type your code here
  for(int i=0;i<length;i++)
  {
    if(str[i]=='a'|| str[i]=='e'|| str[i]=='i'|| str[i]=='o'|| str[i]=='u'|| 
      str[i]=='A'|| str[i]=='E'||str[i]=='I'|| str[i]=='O'|| str[i]=='U')
      str[i]='*';
  }
  for(int i=0;i<length;i++)
  {
    if(str[i]=='*')
      printf("");
    else
      printf("%c",str[i]);
  }
  return 0;
}