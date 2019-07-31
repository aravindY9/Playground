#include<stdio.h>

int main()
{
  //Type your code here
  char ch[100];
  scanf("%[^\n]s",ch);
  int i,word=0;
  for(i=0;ch[i]!='\0';i++)
  {
  if(ch[i]==' ')
  {
    word++;
  }
   //word++;
  }
  word++;
  printf("%d",word);
  
}