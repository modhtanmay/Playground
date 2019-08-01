#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  int binarynum,i,p=0,rem,sum=0;
  scanf("%d",&binarynum);
  while(binarynum!=0)
  {
    rem=binarynum%10;
    sum=sum+rem*pow(2,p);
    p++;
    binarynum=binarynum/10;
  }
  int dec[100];
  while(sum!=0)
  {
    dec[i++]=sum%8;
    sum=sum/8;
  }
  for(int j=i-1;j>=0;j--)
    printf("%d",dec[j]);
}