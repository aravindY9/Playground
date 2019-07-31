#include<stdio.h>
int main()
{
	//type your code here
	int nth_term,s1,s2,a,d,n;
  scanf("%d",&n);
  if(n%2==0)
  {
    a=0,d=1;
    nth_term=n/2;
    s1=a+(nth_term-1)*d;
    printf("%d ",s1);
  }
  else
  {
    a=0,d=2;
    nth_term=(n+1)/2;
    s2=a+(nth_term-1)*d;
    printf("%d",s2);
  }
}