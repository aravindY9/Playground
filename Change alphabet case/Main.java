#include <stdio.h>
int main() {
	// Type your code here
  char ch,a,b;
  scanf("%c",&ch);
  if(ch>=97 && ch<=122)
  {
    a=ch-32;
  printf("%c",a);
  }
  else
  {
    b=ch+32;
    printf("%c",b);
  }
	return 0;
}