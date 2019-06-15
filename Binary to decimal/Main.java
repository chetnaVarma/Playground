#include<stdio.h>
int main()
{
  int num;
  scanf("%d", &num);
  int temp = num;
  int rem = 0;
  int base = 1;
  int decimal = 0;
  while (temp) {
    rem = temp % 10;
    temp = temp / 10;
    decimal += rem * base;
    base = base * 2;
  }
  printf("%d", decimal);
      return 0;
}