#include<stdio.h>
int isPrime(int value) {
  int count = 2;
  for(int i = 2; i <= value / 2; i++) {
    if(value % i == 0) {
      count++;
      break;
    }
  }
  if(count == 2) 
    return 1;
  else return 0;
}
      
      
int main()
{
  int num;
  int sum = 0;
  scanf("%d", &num);
  for(int i = 2; i < num; i++) {
    int res = isPrime(i);
    if(res) 
      sum += i;
  }
  printf("%d", sum);
  return 0;
}