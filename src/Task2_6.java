import java.util.*;

public class Task2_6 {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;

		Scanner sc = new Scanner(System.in);

		// проверка на корректный ввод значения угла A треугольника
		System.out.print("Введите целое значение угла А треугольника в градусах: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите целое значение угла А треугольника в градусах: ");
		}
		a = sc.nextInt();

		// проверка на корректный ввод значения угла В треугольника
		System.out.print("Введите целое значение угла В треугольника в градусах: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите целое значение угла В треугольника в градусах: ");
		}
		b = sc.nextInt();

		
		
		c = (180 - a - b);

		if (c > 0) {
			System.out.print("Треугольник существует.");
			if (a == 90 || b == 90 || c == 90) {
				System.out.println("Треугольник является прямоугольным.");
			}
		} else {
			System.out.println("Треугольник не существует: сумма углов треугольника превышает 180 градусов.");
		}
	}
}