#include<stdio.h>
int main()
{
  int firstValue;
  int secondValue;
  scanf("%d\n", &firstValue);
  scanf("%d\n", &secondValue);
  if(firstValue > secondValue) 
    printf("num1 is the greatest");
  else if(secondValue > firstValue)
    printf("num2 is the greatest");
  else
    printf("Both number Equal");
  return 0;
}