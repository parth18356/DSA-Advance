#include <bits/stdc++.h>
#define endl "\n"

using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	int n,d;
	cin>>n>>d;

	map<int,vector<pair<int,int>>> m;//arriving day-> {val,no_days}

	for(int i=0;i<n;i++){
		int di,ti,si;
		cin>>di>>ti>>si;
		m[di].push_back(make_pair(si,ti));
	}


	priority_queue <pair<int,int>> pq;
	for(int day=1;day<=d;day++){
		for(auto p:m[day]){
			pq.push(p);
		}
		if(pq.empty()){
			continue;
		}
		//
		auto p=pq.top();
		pq.pop();
		if(p.second-1>0){
			pq.push(make_pair(p.first,p.second-1));
		}
		

	}


	//process remaining
	long long int ans=0;
	while(!pq.empty()){
		auto p=pq.top();
		pq.pop();
		ans+=(p.first*p.second);
	}
	cout<<ans<<endl;












	
	return 0;
}

