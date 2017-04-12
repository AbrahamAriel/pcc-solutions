#include <stdio.h>
#include <iostream>

int main() {
	int T;
	std::cin >> T;
	
	while(T-->0) {
		int n;
		std::cin>>n;
		int arr[n];
		
		for(int i=0; i<n; i++) {
			int a;
			std::cin >> a;
			arr[i] = a;
		}
		
		int count = 0;
		for(int i=1; i<n; i++) {
			int a = arr[i];
			
			for(int j=0; j<i; j++) {
				int b = arr[j];
				if(b <= a)
					count++;
			}
		}
		
		std::cout << count << std::endl;
	}
}
