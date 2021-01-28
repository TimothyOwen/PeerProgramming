package peer_programming;

public class Calculator {
	int a;
	int b;
	int c;
	public Calculator(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		checkAdd();
		checkSubtract();
		checkDivide();
		checkMultiply();
	}
	public void checkAdd() {
		if(a+b == c) {
			System.out.println(a+"+"+b+"="+c);
		}
		if(b+c == a) {
			System.out.println(b+"+"+c+"="+a);
		}
		if(a+c == b) {
			System.out.println(a+"+"+c+"="+b);
		}
	}
	public void checkSubtract() {
		if(a-b == c) {
			System.out.println(a+"-"+b+"="+c);
		}
		if(b-a == c) {
			System.out.println(b+"-"+a+"="+c);
		}
		if(b-c == a) {
			System.out.println(b+"-"+c+"="+a);
		}
		if(c-b == a) {
			System.out.println(c+"-"+b+"="+a);
		}
		if(a-c == b) {
			System.out.println(a+"-"+c+"="+b);
		}
		if(c-a == b) {
			System.out.println(c+"-"+a+"="+b);
		}
	}
	public void checkDivide() {
		if(a/b == c) {
			System.out.println(a+"/"+b+"="+c);
		}
		if(b/a == c) {
			System.out.println(b+"/"+a+"="+c);
		}
		if(b/c == a) {
			System.out.println(b+"/"+c+"="+a);
		}
		if(c/b == a) {
			System.out.println(c+"/"+b+"="+a);
		}
		if(a/c == b) {
			System.out.println(a+"/"+c+"="+b);
		}
		if(c/a == b) {
			System.out.println(c+"/"+a+"="+b);
		}
	}
	public void checkMultiply() {
		if(a*b == c) {
			System.out.println(a+"*"+b+"="+c);
		}
		if(b*c == a) {
			System.out.println(b+"*"+c+"="+a);
		}
		if(a*c == b) {
			System.out.println(a+"*"+c+"="+b);
		}
	}
}
