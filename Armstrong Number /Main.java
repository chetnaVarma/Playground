#include <stdio.h>
#include <math.h>
int main() {
  int num;
  scanf("%d", &num);
  int count = 0;
  int temp = num;
  int arr[100] = {0};
  int rem = 0;
  while (num) {
    rem = num % 10;
    arr[count++] = rem;
    num /= 10;
  }
  int sum = 0;
  //printf("%d\n", count);
  for(int i = 0; i < count; i++) {
    sum = sum + pow(arr[i], count);
  }
  if(sum == temp)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
    return 0;
}