package jc01_lesson03_hw.com.sirin.home_work.lesson3;

public class Task08 {

	public static void main(String[] args) {
		/*
		 * 8. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и
		 * объем этого куба.
		 */

		double l = 5; // Длина ребра куба

		double faceArea = Math.pow(l, 2);// Площадь грани
		double totalSurfaceArea = 6 * Math.pow(l, 2);// Площадь полной поверхности
		double volume = Math.pow(l, 3); // Объем

		System.out.println("Площадь грани: " + faceArea);
		System.out.println("Площадь полной поверхности: " + totalSurfaceArea);
		System.out.println("Объем: " + volume);

	}

}
