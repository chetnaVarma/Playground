#include <stdio.h>
int main() {
  int num;
  int rem = 0;
  scanf("%d", &num);
  while(num >= 10) {
    rem = num % 10;
    num = num / 10;
  }
  
  printf("%d", rem);
    return 0;
}