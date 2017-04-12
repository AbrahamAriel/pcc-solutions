#include <stdio.h>
#include <iostream>
#include <algorithm>

int main() {

	int a;
	while(std::cin>>a && a != 0) {
		int arr[a];
		for(int i=0; i<a; i++) {
			std::cin>>arr[i];
		}

		std::sort(arr, arr+a);
		std::cout<<arr[0];
		for(int i=1; i<a; i++) {
			std::cout<<" "<<arr[i];
		}
		std::cout<<std::endl;
		
	}

}
