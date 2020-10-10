import java.util.*;

public class Task2_5 {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;

		Scanner sc = new Scanner(System.in);

		// проверка на корректный ввод числа A
		System.out.print("Введите целое число А: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите целое число А: ");
		}
		a = sc.nextInt();

		// проверка на корректный ввод числа В
		System.out.print("Введите целое число В: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите целое число В: ");
		}
		b = sc.nextInt();

		
		//Сравнение чисел и результат
		if (a < b) {
			System.out.println("Число A равное " + a + " является наименьшим из чисел " + a + " и " + b);
		}

		if (a > b) {
			System.out.println("Число B равное " + b + " является наименьшим из чисел " + a + " и " + b);
		}

		if (a == b) {
			System.out.println("Числа A и B равны");
		}
	}
}