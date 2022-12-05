package com.design_shinbi.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TenSeconds {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in)
			);
		
		System.out.println("Enterを押したらスタートします。");
		reader.readLine();
		
		long start = System.currentTimeMillis();
		
		System.out.println("10秒経ったとおもたらEnter押してもろて");
		
		reader.readLine();
		
		long end = System.currentTimeMillis();
		double time =(double)(end - start)/ 1000.0;
		System.out.println(time + "秒でした。");
		double differ = time - 10;
		System.out.println("差：" + differ + "秒");
		if(differ == 0) {System.out.println("天才じゃったか...");}
		else if(Math.abs(differ)<0.5) {
			System.out.println("惜しすぎるッピ！");
		}
		
		reader.close();
		

	}

}
