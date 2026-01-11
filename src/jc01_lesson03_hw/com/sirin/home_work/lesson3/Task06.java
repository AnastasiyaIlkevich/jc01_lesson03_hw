package jc01_lesson03_hw.com.sirin.home_work.lesson3;

public class Task06 {

	public static void main(String[] args) {
		/*
		 * 6. Найти произведение цифр заданного четырехзначного числа.
		 */

		int n = 1234;//число

		int rez = 1;
		int temp = n;//временная переменнаяч

		while (temp > 0) {
			int num = temp % 10;

			if (num == 0) { //цикл при котором проверяется число. Если оно равно 0, то дальнейшие действия ненужны. Число все равно будет 0
				rez = 0;
				break;
			}

			rez *= num;
			temp /= 10;
		}

		System.out.println("Произведение чисел в числе " + n + " = " + rez);

	}

}
