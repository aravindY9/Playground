#include<stdio.h>
int main()
{
  //Type your code here
  int n,temp;
  int a=0,b=1;
  printf("%d %d ",a,b);
  scanf("%d",&n);
  for(int i=0;i<n-2;i++)
  {
    temp=a+b;
    a=b;
    b=temp;
    printf("%d ",temp);
  }
  
  return 0;
}