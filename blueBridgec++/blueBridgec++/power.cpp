#include<iostream>
#include<bits/stdc++.h>
using namespace std;


int main() {
	int n;
	int m;
	cin >> n >> m;
	if (n % m != 0) {
		cout << -1;
	} else {
		cout << n / m;
	}
	return 0;
}