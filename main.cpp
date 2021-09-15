#include<bits/stdc++.h>
using namespace std;
int main(){
    int n,k;
    cin>>n>>k;
    int arr[n];
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    deque<int>dq;
    int i=0;
    while(i<n){
        while(!dq.empty()&&arr[dq.back()]>arr[i]){
            dq.pop_back();
        }
        while(!dq.empty()&&dq.front()<=i-k){
            dq.pop_front();
        }
        dq.push_back(i);
        i++;
        if(i<k){
            cout<<-1<<" ";
        }
        else{
            cout<<arr[dq.front()]<<" ";
        }
    }
    return 0;
}