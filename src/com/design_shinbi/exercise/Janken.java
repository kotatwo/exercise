package com.design_shinbi.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Janken {

	public static void main(String[] args) throws IOException {
		BufferedReader reader= new BufferedReader(
				new InputStreamReader(System.in));
		int Wi=0, Lo=0, Dr=0;
		while(true) {
		System.out.println("じゃ～んけ～ん♪ [グー:R チョキ:S パー:P]");
		String Input = reader.readLine();
		if(!Input.equals("R") && !Input.equals("S") && !Input.equals("P")) {
			System.out.println("やり直せてめえコラぁ★");
			continue;
			}
		int result =judgement(Input);
		if(result ==1) {Wi++;}
		else if(result == 2) {Lo++;}
		else {Dr++;}
		System.out.println("戦績　Win:" + Wi + " Lose:" + Lo + " Draw:" + Dr);
		System.out.println("ま～だや～るかい？ [はい:y　いいえ:n]");
		Input = reader.readLine();
		 if(!Input.equalsIgnoreCase("Y")) {
			 System.out.println("お疲れぃ！！");
			 reader.close();
			 break;
		 }
		}

	}

	public static int judgement(String Input) {
		int result=0;
		int eh = (int)(Math.random()*3+1);	//1:グー 2:チョキ 3:パーとする
		String[] Eh = {"","R","S","P"};
		if(eh == 1) {
			switch(Input) {
			 case "R":
				 System.out.println("あ～い～こ♡");
				 result =3;
				 break;
			 case "S":
				 System.out.println("まけ....");
				 result =2;
				 break;
			 case "P":
				 System.out.println("か～ち★");
				 result =1;
				 break;
			}
		}else if(eh == 2) {
			switch(Input) {
			 case "R":
				 System.out.println("か～ち★");
				 result =1;
				 break;
			 case "S":
				 System.out.println("あ～い～こ♡");
				 result =3;
				 break;
			 case "P":
				 System.out.println("まけ....");
				 result =2;
				 break;
			}
		}else if(eh == 3) {
			switch(Input) {
			 case "R":
				 System.out.println("まけ....");
				 result =2;
				 break;
			 case "S":
				 System.out.println("か～ち★");
				 result =1;
				 break;
			 case "P":
				 System.out.println("あ～い～こ♡");
				 result =3;
				 break;
			}
		}
		
		System.out.println("あなたの手："+ Input + "　敵の手:" + Eh[eh]);
		return result;
	}

}
