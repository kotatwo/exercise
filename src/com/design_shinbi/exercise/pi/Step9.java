package com.design_shinbi.exercise.pi;

public class Step9 {

	public static void main(String[] args) {
		int i = 0;
		double x = 0;
		double y = 0;
		double total = 0;
		double small = 0;
		for(i=0 ; i<1000000 ; i++) {
			x = Math.random();
			y = Math.random(); 
			total = x*x + y*y;
			if(total <=1 ) {small++;}
		}
		System.out.println(small/1000000*4);

	}

}
