#include <iostream>
#include <cstdio>
#include <algorithm>

int mcycle = 0;

int work(int m, int cycle) {
  unsigned int n = m;
  cycle++;
  if(n == 1) {
    if(cycle > mcycle) {
      mcycle = cycle;
    }

    return cycle;
  }

  if(n % 2 == 1) {
    work(3*n + 1, cycle);
  } else {
    work(n/2, cycle);
  }

}

int main() {
  int n, m;

  while(std::scanf("%d %d", &n, &m) != EOF) {
    mcycle = 0;



    int i = n;
    int j = m;

    if(i > j) {
      std::swap(i, j);
    }

    while(i <= j) {
      work(i, 0);
      i++;
    }

    printf("%d %d %d\n", n, m, mcycle);
  }

  return 0;
}
