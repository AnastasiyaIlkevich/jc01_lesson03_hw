package jc01_lesson03_hw.com.sirin.home_work.lesson3;

public class Task03 {

	public static void main(String[] args) {

		/*
		 * 3. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3).
		 * Найти его периметр и площадь.
		 */

		// координаты точек
		int x1 = 5;
		int y1 = 18;

		int x2 = 12;
		int y2 = 15;

		int x3 = 10;
		int y3 = 11;

		// длинна сторон
		double sideLengthOne = getLengthSide(x1, y1, x2, y2);
		double sideLengthTwo = getLengthSide(x2, y2, x3, y3);
		double sideLengthThree = getLengthSide(x3, y3, x1, y1);

		// периметр и площадь
		double p = sideLengthOne + sideLengthTwo + sideLengthThree;
		double s = Math.sqrt(p / 2 * (p / 2 - sideLengthOne) * (p / 2 - sideLengthTwo) * (p / 2 - sideLengthThree));

		System.out.printf("Р  - %s, S  -  %s.", p, s);

	}

	// метод поиска длинны сторон
	public static double getLengthSide(int x1, int x2, int y1, int y2) {
		double distance = Math.sqrt(Math.abs(x1 - x2) * Math.abs(x1 - x2) + Math.abs(y1 - y2) * Math.abs(y1 - y2));
		return distance;

	}

}
