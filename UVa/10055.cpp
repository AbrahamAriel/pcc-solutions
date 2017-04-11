#include <iostream>
#include <cstdio>
#include <algorithm>

int main() {

  long long i, j;
  while(std::scanf("%lld %lld", &i, &j) != EOF) {
    if(i > j) std::swap(i, j);
    printf("%lld\n", j-i);
  }

  return 0;
}
