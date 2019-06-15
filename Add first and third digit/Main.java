#include<stdio.h>
int main()
{
  int num;
  scanf("%d\n", &num);
  int firstDigit = num / 100;
  int thirdDigit = num % 10;
  printf("%d", firstDigit + thirdDigit); 
  return 0;
}