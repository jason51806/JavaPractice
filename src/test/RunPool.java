package test;

import problem.Q1;
import problem.Q10;
import problem.Q12;
import problem.Q13;
import problem.Q2;
import problem.Q20;
import problem.Q4;
import problem.Q5;
import problem.Q7;
import problem.Q8;
import problem.Q9;

public class RunPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 q1 = new Q1();	q1.result();
		System.out.println("---------------------------------------");
		Q2 q2 = new Q2();	q2.testStudent();
		System.out.println("---------------------------------------");
		Q4 q4 = new Q4();	q4.main(null);
		System.out.println("---------------------------------------");
		Q5 q5 = new Q5();	q5.result();
		System.out.println("---------------------------------------");
		Q7 q7 = new Q7(); 	q7.main(null);
		System.out.println("---------------------------------------");
		Q8 q8 = new Q8();	q8.result();
		System.out.println("---------------------------------------");
		Q9 q9 = new Q9(); q9.main(null);
		System.out.println("---------------------------------------");
		Q10 q10 = new Q10(); q10.main(null);
		System.out.println("---------------------------------------");
		Q12 q12 = new Q12(); q12.main(null);
		System.out.println("---------------------------------------");
		Q13 q13 = new Q13(); q13.result();
		System.out.println("---------------------------------------");
		Q20 q20 = new Q20(); q20.result();
		System.out.println("---------------------------------------");
	}

}
