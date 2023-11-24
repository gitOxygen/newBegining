#include<iostream>
using namespace std;

const int N = 100000;
int com[N];
int R;
int res[100];
int record = 0;
string s = "BNGDE";

void dfs(int n, int r, string *s_origin);
int main() {
    cout << "请输入 :" << endl;
    R = 5;
    int k;
    cin >> k;
    for (int i = 0; i < k; i++) {
        string s1;
        cin >> s1;
        string *s_origin = new string[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            s_origin[i] = s1[i];
        }
        dfs(s.length(), 5, s_origin);
        record++;
    }
    return 0;
}

void dfs(int n, int r,string *s_origin) { //s1要转成数组 或者转换成可以被下标访问
    // 递归结束的条件，数选够了就输出
    if (r == 0) {
        string s_temp = "";
        for (int i = R; i >= 1; i--) {
            s_temp += s_origin[com[i]]; //这边s_temp要把s1拼接好
            if (s_temp.compare(s)) {
                res[record]++;
            }
        }
        cout << endl;
        return;
    }
    for (int i = n; i >= r; i--) {
        // 固定第 r 个数（n、n-1、n-2 ... r），剩余数中取剩下的 r - 1 个数
        com[r] = i;
        dfs(i - 1, r - 1,s_origin);
    }
}
