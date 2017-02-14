package problem;

public class Q10 {
	
	public static void main(String[] args) 
	{
		int count = 0; //How many times is 2 printed as a part of the output?
		
		String[] table = {"aa", "bb", "cc"};
		
		for (String ss: table) 
		{
			int ii = 0;
			
			while (ii < table.length) 
			{
				//System.out.println(ss + ", " + ii);
				if (ii == 2) count++;
				ii++;
			}
		}
		System.out.println(count);
	}
}
