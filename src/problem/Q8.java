package problem;

public class Q8 {

	
		interface SampleCloseable {
			public void close () throws java.io.IOException;
		}
		
		//Which three implementations are valid?
		//A. 
		public class TestA implements SampleCloseable {
			public void close() throws java.io.IOException {
				// do something
			}
		}
		
		//B. 
		/*public class TestB implements SampleCloseable {
			public void close() throws Exception {
				// do something
			}
		}*/
		
		//C. 
		public class TestC implements SampleCloseable {
			public void close() throws java.io.FileNotFoundException { 
				// do something
			}
		}
		
		//D. 
		/*public class TestD extends SampleCloseable {
			public void close() throws java.IO.IOException {
				// do something
			}
		}*/
		
		//E. 
		public class TestE implements SampleCloseable {
			public void close() {
				// do something
			}
		}
		
	public void result() {
		System.out.println("A C E");
		System.out.println(""+ 
				"A: Throwing the same exception is fine.\r\n" + 
				"C: Using a subclass of java.io.IOException (here java.io.FileNotFoundException) is fine\r\n" + 
				"E: Not using a throw clause is fine.");
	}
}
