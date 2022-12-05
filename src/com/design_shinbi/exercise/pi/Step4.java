package com.design_shinbi.exercise.pi;

public class Step4 {

	public static void main(String[] args) {

		for(int i=0 ; i<10 ; i++) {
			double x = Math.random();
			double y = Math.random(); 
			double total = x*x + y*y;
			System.out.println(total + " (x=" + x + ", y=" + y + ")");
		}

	}

}
