#include<stdio.h>
int main()
{
  	//type your code here
  int n,i,c=0,b=0,d,f;
  scanf("%d",&n);
  int a[n];
    for(i=0;i<n;i++)
    {
      scanf("%d",&a[i]);
    }
    int x,y;
    scanf("%d%d",&x,&y);
 
  for(i=0;i<n;i++)
  {
    if(x==a[i])
    {
      d=i;
      c++;
    }
    if(y==a[i])
    {
     f=i;
      b++;
    }
    
  }
  if(c>=1)
  {
    printf("Element 1 index = %d\n",d);
  }
  else
  {
    printf("Element 1 index = -1\n");
  }
    
  
  if(b>=1)
  {
    printf("Element 2 index = %d\n",f);
  }
  else
  {
    printf("Element 2 index = -1\n");
  }
    

}