package problem;

public class Q5 {
	//Which two are valid instantiations and initializations of a multi dimensional array
	public void result() {
		//A.
		//int [] [] array 2D = { { 0, 1, 2, 4} {5, 6}};
		
		//B.
		int [] [] array2D = new int [2] [2];
		array2D[0] [0] = 1;
		array2D[0] [1] = 2;
		array2D[1] [0] = 3;
		array2D[1] [1] = 4;
		
		//C.
		//int [] [] [] array3D = {{0, 1}, {2, 3}, {4, 5}};
		
		//D.
		int[] array = null; 
		int [] [] [] array3D = new int [2] [2] [2];
		array3D [0] [0] = array;
		array3D [0] [1] = array;
		array3D [1] [0] = array;
		array3D [0] [1] = array;
		
		//E.
		//int [] [] array2D = {0, 1};
		
		System.out.println("B D");
	}
}
