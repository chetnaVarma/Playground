#include <stdio.h>
int main() {
  float radius;
  scanf("%f", &radius);
  float circumference = 3.14 * radius * radius;
  printf("%.2f", circumference);
  return 0;
}