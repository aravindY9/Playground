#include<stdio.h>
int main()
{
  //Type your code here
 
  int m,n,sum,i,temp,lcm;
  scanf("%d%d",&m,&n);
  sum=m>n ? n:m;
  for(i=sum;i>-1;i--)
  {
    if(m%i==0 && n%i==0)
    {
      temp=i;
      break;
  
    }
  }
    lcm=(m*n)/temp;
  
  printf("%d",lcm);
 return 0;
}