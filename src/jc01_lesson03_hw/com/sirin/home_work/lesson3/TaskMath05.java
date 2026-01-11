package jc01_lesson03_hw.com.sirin.home_work.lesson3;

public class TaskMath05 {

	public static void main(String[] args) {

		/*
		 * Класс Math: 5. Вычислить значение выражения по формуле (все переменные
		 * принимают действительные значения):
		 * 
		 * sin x + cos y 
		 * cos x − sin y 
		 * ∗ tg xy
		 */
		
		// Создаем переменные
		
		double x = 5;
		double y = 8;
		double result;

		
		result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * (Math.tan(x) * Math.tan(y)); //решаем уравнение используя Класс Math

		System.out.println(result);

	}

}
