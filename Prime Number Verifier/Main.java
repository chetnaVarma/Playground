// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int num;
  scanf("%d", &num);
  int count = 2;
  if(num > 0) {
  for(int i = 2; i <= num/2; i++) {
    if( num % i == 0) {
      count++;
      break;
    }
  }
  if(count == 2)
    printf("prime");
  else
    printf("composite");
  } else 
    printf("neither");
   
     return 0;
}