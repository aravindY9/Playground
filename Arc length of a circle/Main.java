#include<stdio.h>

int main()
{
  float radius,angle,pi=3.14,arc;
  scanf("%f%f",&radius,&angle);
  arc=(2*pi*radius)*(angle/360);
  printf("%.2f",arc);
  return 0;
}