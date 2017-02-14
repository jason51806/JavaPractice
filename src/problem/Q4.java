package problem;

public class Q4 {
	
	int z;
	public static void main(String[] args){
		Q4 myScope = new Q4();
		int z = 6;
		System.out.print(z + " ");
		myScope.doStuff();
		System.out.print(z + " ");
		System.out.println(myScope.z);
	}
	
	void doStuff() {
		int z = 5;
		doStuff2();
		System.out.print(z + " ");
	}
	
	void doStuff2() {
		z = 4;
	}
}
