#include<stdio.h>
int main()
{
  //Type your code here
  int a[100],i,n,m,j=0,c=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&m);
  for(i=0;i<n;i++)
  {
    j++;
    if(a[i]==m)
    {
      c++;
      break;
    }
  }
  if(c==1)
  {
  printf("%d",j);
  }
  else
  {
    printf("%d isn't present in the array.",m);
  }
  return 0;
}