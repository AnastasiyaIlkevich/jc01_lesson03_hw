package jc01_lesson03_hw.com.sirin.home_work.lesson3;

public class Task01 {

	public static void main(String[] args) {

		/*
		 * 1. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b
		 * двух катетов.
		 */

		double a = 5; // катет а прямоугольного треугольника
		double b = 6; // катет b прямоугольного треугольника

		double s; // Площадь прямоугольного треугольника
		double p; // Периметр прямоугольного треугольника
		double c; // Гипотенуза прямоугольного треугольника

		s = a * b / 2;
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		p = a + b + c;

		System.out.println("S ----> " + s);
		System.out.println("P ----> " + p);

	}

}
