import java.util.*;

public class Task2_8 {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int x = 0;
		int y = 0;
		int z = 0;

		Scanner sc = new Scanner(System.in);

		// проверка на корректный ввод ширины проёма a
		System.out.print("Введите ширину проёма в мм: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите ширину проёма в мм: ");
		}
		a = sc.nextInt();

		// проверка на корректный ввод высоты проёма b
		System.out.print("Введите высоту проёма в мм: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите высоту проёма в мм: ");
		}
		b = sc.nextInt();

		// проверка на корректный ввод длины кирпича x
		System.out.print("Введите длину кирпича в мм: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите длину кирпича в мм: ");
		}
		x = sc.nextInt();

		// проверка на корректный ввод ширины кирпича y
		System.out.print("Введите ширину кирпича в мм: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите ширину кирпича в мм: ");
		}
		y = sc.nextInt();

		// проверка на корректный ввод высоты кирпича z
		System.out.print("Введите высоту кирпича в мм: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите высоту кирпича в мм: ");
		}
		z = sc.nextInt();

		
		// Сравнение и результат
		if ((a > x) && (b > y)) {
			System.out.println("Кирпич пройдет в проём.");
		} else if ((a > y) && (b > x)) {
			System.out.println("Кирпич пройдет в проём.");
		} else if ((a > x) && (b > z)) {
			System.out.println("Кирпич пройдет в проём.");
		} else if ((a > z) && (b > x)) {
			System.out.println("Кирпич пройдет в проём.");
		} else if ((a > y) && (b > z)) {
			System.out.println("Кирпич пройдет в проём.");
		} else if ((a > z) && (b > y)) {
			System.out.println("Кирпич пройдет в проём.");
		} else {
			System.out.println("Кирпич не пройдет в проём.");
		}
	}
}