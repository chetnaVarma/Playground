#include <stdio.h>
int main() {
  int num;
  scanf("%d", &num);
  int sum = 0;
  while(num || sum > 9) {
    if(num == 0) {
      num = sum;
      sum = 0;
    }
    sum += num % 10;
    num /= 10;
  }
  printf("%d", sum);
  return 0;
}