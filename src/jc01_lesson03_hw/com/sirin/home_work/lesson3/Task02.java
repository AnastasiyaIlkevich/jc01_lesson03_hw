package jc01_lesson03_hw.com.sirin.home_work.lesson3;

public class Task02 {

	public static void main(String[] args) {

		/*
		 * 2. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и
		 * (x2, у2).
		 */

		int x1 = 5;
		int y1 = 18;

		int x2 = 12;
		int y2 = 15;

		double distance = Math.sqrt(Math.abs(x1 - x2) * Math.abs(x1 - x2) + Math.abs(y1 - y2) * Math.abs(y1 - y2));

		System.out.println("Растояние --->  " + distance);

	}

}
