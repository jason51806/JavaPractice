package problem;

public class Q9 {
	public static void main(String args[]) {
		int [][] array = {{0}, {0, 1}, {0, 2, 4}, {0, 3, 6, 9}, {0, 4, 8, 12, 16}};
		System.out.print(array[4][1]);
		
		//System.out.print(array[1][4]);
		System.out.println(" Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException");
	}
}
