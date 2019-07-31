#include<stdio.h>
int main()
{
  //Type your code here
  int n,sum,rem,i=0;
  scanf("%d",&n);
  while(n!=0)
  {
    rem=n%2;
    sum=sum+rem*pow(2,i);
    n=n/10;
    i++;
  }
  printf("%d",sum);
  return 0;
}