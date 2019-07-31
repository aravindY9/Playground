#include<stdio.h>
int main()
{
  //type your code here
  int n,arr[200],i;
  scanf("%d",&n);
  int rem=0;
  while(n!=0)
  {
	arr[rem]=n%8;
    n/=8;
    rem++;
  }
  for(i=rem-1;i>=0;i--)
  {
    printf("%d",arr[i]);
  }
  return 0;
}