#include<iostream>
using namespace std;

const int N = 100000;
int com[N];
int R;
int res[100];

void dfs(int n, int r);
int main() {
    cout << "������ :" << endl;
    int n;
    int r;
    cin >> n >> r;
    R = r;
    dfs(n,r);
    
    return 0;
}

void dfs(int n, int r) { 
    // �ݹ��������������ѡ���˾����
    if (r == 0) {
        for (int i = R; i >= 1; i--) {
            cout << com[i] << " ";
        }
        cout << endl;
        return;
    }
    for (int i = n; i >= r; i--) {
        // �̶��� r ������n��n-1��n-2 ... r����ʣ������ȡʣ�µ� r - 1 ����  
        com[r] = i;
        dfs(i - 1, r - 1);
    }
}
