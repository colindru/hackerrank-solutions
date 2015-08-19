// https://www.hackerrank.com/challenges/c-tutorial-basic-data-types

#include <iostream>
#include <cstdio>
using namespace std;

int main() {
	int i, scanResult;
	long l;
	long long ll;
	char ch;
	float f;
	double d;
	
	scanResult = scanf("%d %ld %lld %c %f %lf", &i, &l, &ll, &ch, &f, &d);
	printf("%d\n", i);
	printf("%ld\n", l);
	printf("%lld\n", ll);
	printf("%c\n", ch);
	printf("%f\n", f);
	printf("%lf\n", d);
    return 0;
}
