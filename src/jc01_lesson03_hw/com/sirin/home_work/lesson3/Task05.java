package jc01_lesson03_hw.com.sirin.home_work.lesson3;

public class Task05 {

	public static void main(String[] args) {
		
		/*
		 * 5. Написать программу, которая выводит на экран первые четыре степени числа
		 * π.
		 */

		double pi = Math.PI;
		for (int i = 1; i <= 4; i++) {
			double num = Math.pow(pi, i);
			System.out.printf("π^%d = %s", i, num);
			System.out.println();
		}

	}

}
