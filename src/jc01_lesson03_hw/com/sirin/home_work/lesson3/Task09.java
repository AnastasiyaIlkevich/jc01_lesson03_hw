package jc01_lesson03_hw.com.sirin.home_work.lesson3;

public class Task09 {

	public static void main(String[] args) {
		/*
		 * 9. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
		 */


		        double a = 4; // Длина стороны треугольника

		        double s = (Math.sqrt(3) / 4) * Math.pow(a, 2);// площадь
		        double h = (Math.sqrt(3) / 2) * a;// высота
		        double inRadius = (Math.sqrt(3) / 6) * a;// радиус вписаной окружности
		        double circumRadius = (Math.sqrt(3) / 3) * a;// радиус описанной окружнасти

		        System.out.println("Площадь: " + s);
		        System.out.println("Высота: " + h);
		        System.out.println("Радиус вписанной окружности: " + inRadius);
		        System.out.println("Радиус описанной окружности: " + circumRadius);
		    }

		   

}
