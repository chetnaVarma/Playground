#include <stdio.h>
int main() {
  int num;
  int temp;
  int rem;
  scanf("%d", &num);
  temp = num % 10;
  while(num >= 10) {
    num = num / 10;
  }
  printf("%d", num+temp);
	return 0;
}