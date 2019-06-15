#include<stdio.h>
int main()
{
  int  first;
  int second;
  int third;
  scanf("%d\n", &first);
  scanf("%d\n", &second);
  scanf("%d\n", &third);
  int avg = (first + second + third) / 3;
  printf("%d", avg);
  return 0;
}