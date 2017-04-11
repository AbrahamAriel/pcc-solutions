#include <stdio.h>
#include <iostream>
#include <string.h>

int main() {
  int current = 0;
  while(!std::cin.eof()) {
    std::string str1;
    std::getline(std::cin, str1);
    std::string str2 = "";
    int i = 0;

    while(i < str1.length()) {

      if(str1[i] == '\"') {
        current++;
        if(current == 1) {
          str2 += "``";
        } else {
          str2 += "\'\'";
        }
      } else {
        str2 += str1[i];
      }

      if(current == 2 ) current = 0;
      i++;
    }

    if(std::cin.eof()) {
      printf("%s", str2.c_str());
    } else {
      printf("%s\n", str2.c_str());
    }

  }

  return 0;
}
