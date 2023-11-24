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
    cout << "������ :" << endl;
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

void dfs(int n, int r,string *s_origin) { //s1Ҫת������ ����ת���ɿ��Ա��±����
    // �ݹ��������������ѡ���˾����
    if (r == 0) {
        string s_temp = "";
        for (int i = R; i >= 1; i--) {
            s_temp += s_origin[com[i]]; //���s_tempҪ��s1ƴ�Ӻ�
            if (s_temp.compare(s)) {
                res[record]++;
            }
        }
        cout << endl;
        return;
    }
    for (int i = n; i >= r; i--) {
        // �̶��� r ������n��n-1��n-2 ... r����ʣ������ȡʣ�µ� r - 1 ����
        com[r] = i;
        dfs(i - 1, r - 1,s_origin);
    }
}
