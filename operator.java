package week13b;

public class operator {
	
	static int sum(int p, int q) {
		int a,b,c;
		a=p;
		b=q;
		c=a+b;
		System.out.println("result is "+c);
		return c;
	}
	
	public static void main(String[]args) {
//		  int a=10,b=20,c;
//		  c=sum(a,b);
		  sum(10,20);
		  operator op = new operator();
		  op.sum(20, 40);
	}
}
 