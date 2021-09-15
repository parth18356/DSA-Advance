#include<bits/stdc++.h>
using namespace std;
int toi(int n, int src, int aux, int des){
    if(src==2)
        return 1;
    if(n==0)
        return 0;
    if(n==1)
        return 1;
    int steps =0;
    steps+= toi(n-1, src,des,aux);
    steps++;
    steps+=toi(n-1, aux, src, des);
    return steps;
}
int main()
{
    int n;
    cin>>n;
    cout<<toi(n,1,2,3);
    return 0;
}