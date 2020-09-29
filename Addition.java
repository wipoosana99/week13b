package week13b;

public class Addition {
	
	public static void Math(int a,int b) {
		int c;
		c=a+b;
		System.out.println("c ="+c);

	}
	static void add() {
		System.out.println("Overloading ");
	}
	
	int add(int a,int b) {
		return(a+b);
	}
//	
	int add(int a,int b,int c) {
		return (a+b+c);
	}
	static void add(double a,double b,double c) {
		double p,m,n,t;
		p=a;
		m=b;
		n=c;
		t=p+m+n;
		System.out.println("No calling dd method with two int parameter" +c);
	}
	
	public static void main(String[]args) {
		Addition obj1 = new Addition();
		System.out.println("calling add method with two int parameter "+obj1.add(17,25));
		System.out.println("calling add method with two int parameter "+obj1.add(17,25+8));
		System.out.println("calling add method with two int parameter "+obj1.add(17,20+30));
	}
}
