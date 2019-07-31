#include<stdio.h>
int main()
{
	//your code here
  long int a,sum=1,i;
  scanf("%d",&a);
  for(i=1;i<=a;i++)
  {
    sum=sum*i;
  }
  
  printf("%ld",sum);
}