package com.design_shinbi.exercise.sum;

public class Sum {
	public int total=0;
	public Sum(int Start, int End) {
		for(int i=Start ; i<=End ; i++) {
		total+=i;
		}
	}
}
