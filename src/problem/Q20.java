package problem;

public class Q20 {
	
	public Q20(){}
	
	public void result() {
		String message1 = "Wham bam!";
		String message2 = new String("Wham bam!");
		if (message1 == message2)
		System.out.println("They match");
		if (message1.equals(message2))
		System.out.println("They really match");
	}
}
