#include <stdio.h>
int main() {
  char str1[100];
  char str2[100];
  char str3[100];
  scanf("%s\n", str1);
  scanf("%s\n", str2);
  scanf("%s\n", str3);
  for(int i = 0; str1[i] != '\0'; i++) {
    if(str1[i] == 'a' || str1[i] == 'e' || str1[i] == 'i' || str1[i] == 'o' || str1[i] == 'u') 
      str1[i] = '$';
    printf("%c", str1[i]);
  }
  for(int i = 0; str2[i] != '\0'; i++) {
    if(str2[i] != 'a' && str2[i] != 'e' && str2[i] != 'i' && str2[i] != 'o' && str2[i] != 'u') 
      str2[i] = '#';
    printf("%c",str2[i]);
  } 
  for(int i = 0; str3[i] != '\0'; i++) {
    str3[i] = str3[i] - 32;
    printf("%c", str3[i]);
  }
   return 0;
}
      