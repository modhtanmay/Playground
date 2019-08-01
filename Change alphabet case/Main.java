#include <stdio.h>
int main() {
	// Type your code here
  char c;
  scanf("%c",&c);
  if(c>=65 && c<=91) printf("%c",c+32);
  if(c>=95 && c<=122) printf("%c",c-32);
	return 0;
}