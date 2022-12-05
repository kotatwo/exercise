package com.design_shinbi.exercise.pi;

public class Step6 {

	public static void main(String[] args) {
		int small = 0;
		for(int i=0 ; i<10 ; i++) {
			double x = Math.random();
			double y = Math.random(); 
			double total = x*x + y*y;
			if(total <=1 ) {small++;}
		}
		System.out.println(small + "回");

	}

}
