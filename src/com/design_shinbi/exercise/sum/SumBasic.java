package com.design_shinbi.exercise.sum;

import java.util.Scanner;

public class SumBasic {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int st, en;
		
		System.out.println("＿から　までを足し算します。");
		st=scr.nextInt();
		System.out.printf("%dから＿までを足し算します。\n", st);
		en=scr.nextInt();
		Sum ans = new Sum(st, en);
		System.out.println(
				String.format("%dから%dまでを足した計算結果: " + ans.total , st, en));
		scr.close();
	}


}
//田中先生曰く、printf書式は楽だがコンソールに表示する時しか使えないからいろいろな場面で使えるString.Formatの方が良いらしいぞ！
//通常のメソッドはcamelCaseで書いてみる。
//コンストラクター名は大文字から始める。