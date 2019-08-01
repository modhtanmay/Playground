#include<stdio.h>
#include<math.h>
int main()
{
	//type your code here
  char str[100];
  int c=1;
  scanf("%s",str);
  if(strlen(str)>20)
    printf("Invalid Input");
  else
  {
    for(int i=0;i<strlen(str);i++)
    {
      if(str[i]==str[i+1])
        c++;
      else
      {
        printf("%c%d",str[i],c);
        c=1;
      }
    }
  }
}