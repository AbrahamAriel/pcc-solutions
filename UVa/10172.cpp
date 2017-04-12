#include <iostream>
#include <stdio.h>
#include <vector>

int main() {

	int set;
	std::cin>>set;
	while((set--) > 0) {
		int N,S,Q, time = 0;
		std::cin>>N>>S>>Q;

		std::vector<std::vector<int>> vec(N, std::vector<int>());
		std::vector<int> carrier;
		
		for(int i=0; i<N; i++) {
			int c;
			std::cin>>c;
			while((c--) > 0) {
				int x;
				std::cin>>x;
				vec[i].push_back(x);
			}
		}

		bool firstLoad = true;
		int i = 0;
		while(true){
			// Unload the carrier
			bool canUnload = true;
			while(carrier.size() > 0 && (canUnload)) {
				if(carrier[carrier.size()-1] == i+1) {
					carrier.erase(carrier.end()-1);
					time++;
				} else if(vec[i].size() < Q) {
					vec[i].push_back(carrier[carrier.size()-1]);
					carrier.erase(carrier.end()-1);
					time++;
				} else {
					canUnload = false;
				}
			}
			
			// Load the carrier
			bool canLoad = true;
			if(vec[i].size() == 0) {
				canLoad = false;
			}
			while(carrier.size() < S && canLoad) {
				carrier.push_back(vec[i][0]);
				vec[i].erase(vec[i].begin());
				time++;
				if(vec[i].size() == 0) {
					canLoad = false;
				}
				firstLoad = false;
			}
			
			// Continue if more
			bool noMore = false;
			if(carrier.size() == 0) {
				noMore = true;
			}
			for(int z=0; z<N; z++) {
				if(vec[z].size() != 0) {
					noMore = false;
				}
			}
			
			if(noMore) break;
			
			i = (i+1)%N;
			time += 2;
		}
		
		std::cout<<time<<std::endl;
	}
	return 0;
}
