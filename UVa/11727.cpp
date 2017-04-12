#include <iostream>
#include <stdlib.h>
#include <stdio.h>

int main() {
	int n;
	scanf("%i", &n);
	for(int i=1; i<=n; i++) {
		int a, b, c, mid;
		scanf("%i %i %i", &a, &b, &c);
		if(a > b) {
			if(b > c)
				mid = b;
			else if(a > c)
				mid = c;
			else
				mid = a;
		} else {
			if(a > c)
				mid = a;
			else if(b > c)
				mid = c;
			else
				mid = b;
		}
		printf("Case %i: %i\n", i, mid);
	}
}
