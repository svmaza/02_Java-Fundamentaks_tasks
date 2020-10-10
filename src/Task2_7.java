import java.util.*;

public class Task2_7 {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		// проверка на корректный ввод числа A
		System.out.print("Введите целое число А: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите целое число А: ");
		}
		a = sc.nextInt();

		// проверка на корректный ввод числа B
		System.out.print("Введите целое число B: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите целое число B: ");
		}
		b = sc.nextInt();

		// проверка на корректный ввод числа C
		System.out.print("Введите целое число C: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите целое число C: ");
		}
		c = sc.nextInt();

		
		//Сравнение и результат
		if (a < 0) {
			count = count + 1;
		}

		if (b < 0) {
			count = count + 1;
		}

		if (c < 0) {
			count = count + 1;
		}

		System.out.println("Среди чисел a, b и c отрицательных значений - " + count);
	}
}