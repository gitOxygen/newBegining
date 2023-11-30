#include<iostream>
using namespace std;

const int N = 100000;
int com[N];
int R;
int res[100];

void dfs(int n, int r);
int main() {
    cout << "请输入 :" << endl;
    int n;
    int r;
    cin >> n >> r;
    R = r;
    dfs(n,r);
    
    return 0;
}

void dfs(int n, int r) { 
    // 递归结束的条件，数选够了就输出
    if (r == 0) {
        for (int i = R; i >= 1; i--) {
            cout << com[i] << " ";
        }
        cout << endl;
        return;
    }
    for (int i = n; i >= r; i--) {
        // 固定第 r 个数（n、n-1、n-2 ... r），剩余数中取剩下的 r - 1 个数  
        com[r] = i;
        dfs(i - 1, r - 1);
    }
}
