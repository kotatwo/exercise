package com.design_shinbi.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rola {

	public static void main(String[] args) throws IOException {
		int times=0;
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		System.out.println("ローラもおともしとうございます。");
		
		boolean agreed = false;
		while(!agreed) {
			System.out.println("このローラも連れてってくださいますわね？（圧）");
			System.out.println("[Y]はい　[N]いいえ");
			String input = reader.readLine();
			if(input.equalsIgnoreCase("Y")) {
				agreed = true;
				
			}else {
				System.out.println("そんなひどない...？");
				times++;
			}
		}
		System.out.println("うれしゅうございます★");
		if(times>9) {System.out.println("（なんとかゴリ押しましたわ★）");}
		
		reader.close();
	}

}
