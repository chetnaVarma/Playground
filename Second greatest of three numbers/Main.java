#include <stdio.h>
int main() {
  int num1;
  int num2;
  int num3;
  scanf("%d\n", &num1);
  scanf("%d\n", &num2);
  scanf("%d\n", &num3);
  int max = (num1 > num2) ? (num1 > num3 ? num3 : num1) : (num2 > num3 ? num3 : num2);
  printf("second greatest = %d", max);
  return 0;
}