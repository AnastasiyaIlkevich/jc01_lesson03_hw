package jc01_lesson03_hw.com.sirin.home_work.lesson3;

public class Task04 {

	public static void main(String[] args) {

		/*
		 * 4. Вычислить длину окружности и площадь круга одного и того же заданного
		 * радиуса R.
		 */

		int r = 5; // радиус

		double s = Math.PI * (r * r); // площадь
		double l = 2 * Math.PI * r; // длина

		System.out.printf("площадь  - %s, длина окружности  -  %s.", s, l);

	}

}
