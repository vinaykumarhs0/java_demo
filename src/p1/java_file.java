package p1;

import java.util.Scanner;

public class java_file {
	
	double p,t,r,si;
	double c1,c2;
	Scanner s;
	void input() {
		s=new Scanner(System.in);
		System.out.println("Enter the Princeple amount");
		p=s.nextDouble();
		System.out.println("Enter the Rate of Intrest");
		r=s.nextDouble();
		System.out.println("Enter the Time span");
		t=s.nextDouble();
	}
	void compute() {
		si=(p*r*t)/100;
		c1=p*Math.pow(1+(r/100),t);
	}
	void display() {
		System.out.println("The simple intrest is = "+(si+p));
		System.out.println("The compound interest is = "+c1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java_file j=new java_file();
		j.input();
		j.compute();
		j.display();
	}
}
