package problem;

public class Q13 {

	public class SampleClass
	{
		public void main(String[] args)
		{
			AnotherSampleClass asc = new AnotherSampleClass();
			SampleClass sc = new SampleClass();
			sc = asc;
		}
	}
	
	class AnotherSampleClass extends SampleClass
	{
		
	}
	
	public void result() {
		System.out.println("only child can be assigned to father");
	}
}
