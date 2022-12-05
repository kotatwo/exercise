package com.design_shinbi.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kazuate {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		double random = Math.random();
		int answer = (int)Math.floor(random * 10.0) + 1;
		int inputNumber = 0;
		int times = 0;
		int limit = 6;
		int clear =0;
		while(inputNumber != answer && times != 5) {
			times++;
			limit--;
			System.out.println("数字を入れてね♡[1～10] あと" + limit + "回以内で当てろ");
			
			String input = reader.readLine();
			inputNumber = Integer.parseInt(input);
			
			if(inputNumber < answer) {
				if(answer-inputNumber == 1) {System.out.print("惜しい！");}
				System.out.println("数字が小さいよ");
			}else if(inputNumber > answer) {
				if(inputNumber-answer == 1) {System.out.print("惜しい！");}
				System.out.println("数字が大きいze");
			}else {
				System.out.println("あったりぃー！");
				clear=1;
			}

		}
		reader.close();
		if(times != 5 || clear == 1)System.out.println(times + "回で正解です！");
		if(times == 1) {System.out.println("やりますねぇ...。");}
		if(times == 2) {System.out.println("ほう....。");}
		if(times == 3) {System.out.println("ふーん...。");}
		if(times == 4) {System.out.println("危なかったな。");}
		if(times == 5 && clear == 1){System.out.println("間一髪だな...。");}
		if(times == 5 && clear == 0) {System.out.println("GameOver!　アンタ一体前世で何をやらかした！？");}

		
	}

}
