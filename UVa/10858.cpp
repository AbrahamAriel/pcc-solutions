#include <stdio.h>
#include <iostream>
#include <vector>
#include <string>
#include <sstream>

std::vector<std::string> vec;
std::stringstream ss;
int count;

void factor(int num, int start, std::string str) {

	for(int i=start; i*i<=num; i++) {
		if(num % i == 0) {
			std::stringstream ss(str);
			int d = num / i;
			ss << str << i << " ";
			factor(d,i,ss.str());
		}
	}
	
	std::stringstream ss(str);
	ss << str << num;
	vec.push_back(ss.str());
	count++;
	return;
}

int main() {
	int n;
	while((std::cin>>n) && n != 0) {
		vec.clear();
		count = 0;
		factor(n,2,"");
		printf("%d\n", count-1);
		for(int i=0; i<(count-1); i++) {
			printf("%s\n", vec[i].c_str());
		}
	}
	return 0;
}
