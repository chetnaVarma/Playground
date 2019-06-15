#include <stdio.h>
int fact(int rem) {
  if (rem == 1) 
    return 1;
  else
    return rem*fact(rem-1);
}
int main() {
  int num;
  scanf("%d", &num);
  int rem = 0;
  int temp = num;
  int sum = 0;
  while (num) {
    rem = num % 10;
    num /= 10;
    sum += fact(rem);
  }
  if(sum == temp) 
    printf("Yes");
  else
    printf("No");
	return 0;
}