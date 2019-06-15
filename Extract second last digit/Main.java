#include<stdio.h>
int main()
{
  int num;
  scanf("%d\n", &num);
  int res = (num % 100) / 10;
  printf("%d", res);
  return 0;
}