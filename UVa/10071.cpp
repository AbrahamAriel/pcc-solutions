#include <cstdio>
#include <iostream>

int main() {

  double v, t;
  while(std::scanf("%lf %lf", &v, &t) != EOF) {
    if(v == 0 || t == 0) {
      printf("0\n");
    } else {
      double tt = t*2;
      double a = v/t;
      double vv = a*tt;
      double vi = vv - (a*t);
      double aa = (v-vi)/tt;
      double d = (vi*tt)+((aa*(tt*tt))/2);
      printf("%.0lf\n", d);
    }

  }

  return 0;
}
