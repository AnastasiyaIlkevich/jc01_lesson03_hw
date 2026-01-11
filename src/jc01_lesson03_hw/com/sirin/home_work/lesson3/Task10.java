package jc01_lesson03_hw.com.sirin.home_work.lesson3;

public class Task10 {

	public static void main(String[] args) {
		/*
		 * 10. Известна длина окружности. Найти площадь круга, ограниченного этой
		 * окружностью.
		 */

		double l = 20; // Длина окружности
		double s = Math.PI * Math.pow(l / (2 * Math.PI), 2);
		System.out.println("S ----> " + s);
		
	}

}
