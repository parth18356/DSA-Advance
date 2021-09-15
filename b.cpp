#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n,m;
    cin>>n>>m;
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    vector<vector<int>>matrix(n,vector<int>(m,0));
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            cin>>matrix[i][j];
        }
    }
    int q;
    cin>>q;
    while(q--){
        int target;
        cin>>target;
        int i=0, j=m-1;
        bool done=0;
        while(i<n && j>=0){
            if(matrix[i][j]>target)
                j--;
            else if(matrix[i][j]<target)
                i++;
            else{
                cout<<i+1<<" "<<j+1<<"\n";
                done =1 ;
                break;
            }
        }
        if(!done)cout<<-1<<"\n";
    }
    return 0;
}
