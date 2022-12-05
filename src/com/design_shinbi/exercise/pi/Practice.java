package com.design_shinbi.exercise.pi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		double small = 0;
		System.out.println("試行回数を入力してくだちい");
		String input = reader.readLine();
		int number = Integer.parseInt(input);
		for (int i = 0; i < number; i++) {
			double x = Math.random();
			double y = Math.random();
			double total = x * x + y * y;
			if (total <= 1) {
				small++;
			}
		}
		reader.close();
		System.out.println("1以下になった回数" + (int) small + "回");
		System.out.println("円周率: " + small / number * 4);

	}

}
//forを使う際宣言を外に書かないほうが良い。何度も宣言されるため余計にメモリを食うと思いがちだが、スコープが広がるほうがメモリを食うので
//メモリを削減したいなら尚更中に書くようにしたほうが良い。これ鉄則～♪
//右クリックでソース→フォーマットを押せば字下げしてくれるで！
