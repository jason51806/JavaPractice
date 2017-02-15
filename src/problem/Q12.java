package problem;

public class Q12 {

	String str = "default";
	
	public Q12(){}
	
	Q12(String s) {
		str = s;
	}
	
	void print () {
		System.out.println(str);
	}
	
	public static void main(String[] args)
	{
		new Q12("hello").print();
	}
	
}
