#include<stdio.h>
int main()
{
  int num;
  scanf("%d", &num);
  int quotient = num / 10;
  int remainder = num % 10;
  printf("%d", quotient + remainder);
  return 0;
}