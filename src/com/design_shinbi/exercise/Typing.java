package com.design_shinbi.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Typing {
	public static List<String> getList() throws IOException {
		List<String> list = new ArrayList<String>();

		InputStream stream = Typing.class.getResourceAsStream("typing.txt");
		BufferedReader fileReader = new BufferedReader(new InputStreamReader(stream));

		String line = null;
		while ((line = fileReader.readLine()) != null) {
			String sentence = line.trim();
			if (sentence.length() > 0 && !list.contains(sentence)) {
				list.add(sentence);
			}
		}
		Collections.shuffle(list);

		fileReader.close();
		stream.close();

		return list;
	}

	public static void start(BufferedReader reader) throws IOException {
		List<String> list = getList();

		long start = System.currentTimeMillis();

		int correct = 0;
		for (int i = 0; i < 10; i++) {
			String sentence = list.get(i);
			System.out.println(sentence);

			String input = reader.readLine();
			if (input.equalsIgnoreCase(sentence)) {
				System.out.println("〇");
				correct++;
			} else {
				System.out.println("x");
			}
		}

		long end = System.currentTimeMillis();
		double seconds = (double) (end - start) / 1000.0;

		System.out.println(
				String.format("正解数: %d", correct));
		System.out.println(
				String.format("タイム: %.1f", seconds));
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		while (true) {
			System.out.println("Enterキーを押しなさい。");
			reader.readLine();

			start(reader);

			System.out.println("もう一度やりますか？ [Y/N]");
			String input = reader.readLine();
			if (!input.equalsIgnoreCase("Y")) {
				reader.close();
				System.out.println("終了しました。");
				break;
			}
		}

	}

}
//タイピングの題材は「嘔吐、又」の歌詞を英訳したもの。