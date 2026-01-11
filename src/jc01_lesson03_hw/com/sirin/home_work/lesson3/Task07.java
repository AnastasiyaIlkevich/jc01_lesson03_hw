package jc01_lesson03_hw.com.sirin.home_work.lesson3;

public class Task07 {

	public static void main(String[] args) {

		/*
		 * 7. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
		 * геометрическое модулей этих чисел.
		 */

		double num1 = 12;
		double num2 = -4;

		double averageCubeNum = (Math.pow(num1, 3) + Math.pow(num2, 3)) / 2;
		double averageGeometricNum = Math.sqrt(Math.abs(num1) * Math.abs(num2));

		System.out.println("Среднее арифметическое кубов: " + averageCubeNum);
		System.out.println("Среднее геометрическое модулей: " + averageGeometricNum);
	}

}
