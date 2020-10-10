import java.util.*;

public class Task2_2 {
	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double result;

		Scanner sc = new Scanner(System.in);

		// проверка на корректный ввод числа а
		System.out.print("Введите число a: ");
		while (!sc.hasNextDouble()) {
			System.out.println("Введено не числовое значение.");
			sc = new Scanner(System.in);
			System.out.print("Введите число a: ");
		}
		a = sc.nextDouble();

		// проверка на корректный ввод числа b
		System.out.print("Введите число b: ");
		while (!sc.hasNextDouble()) {
			System.out.println("Введено не числовое значение.");
			sc = new Scanner(System.in);
			System.out.print("Введите число b: ");
		}
		b = sc.nextDouble();

		// проверка на корректный ввод числа с
		System.out.print("Введите число c: ");
		while (!sc.hasNextDouble()) {
			System.out.println("Введено не числовое значение.");
			sc = new Scanner(System.in);
			System.out.print("Введите число с: ");
		}
		c = sc.nextDouble();

		// проверка на корректный ввод числа d
		System.out.print("Введите число d: ");
		while (!sc.hasNextDouble()) {
			System.out.println("Введено не числовое значение.");
			sc = new Scanner(System.in);
			System.out.print("Введите число d: ");
		}
		d = sc.nextDouble();
		
		
		//Расчёт
		result = (a / c) * (b / d) - ((a * b) - c) / (c * d);
		System.out.println("Результат = " + result);
	}
}