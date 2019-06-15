#include <stdio.h>
int main() {
  int num;
  scanf("%d", &num);
  printf("1\n");
  int i = 3;
  while(num > 1) {
    if(i % 2 != 0) {
      num--;
      printf("%d\n", i);
    }
    i++;
  }
  return 0;
}