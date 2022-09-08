package org.test;

public class Sample {
public static boolean Test1(int no) {

	if (no<=1) {
		return false;
	}
	for (int i = 2; i <=no; i++) {
		if (no%2==0) {
			return false;
		}
	}
	return true;
}
public static void main(String[] args) {
	System.out.println(Test1(10));
}
}
