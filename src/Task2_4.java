import java.util.*;

public class Task2_4 {
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

		// проверка на корректный ввод числа B
		System.out.print("Введите целое число В: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите целое число В: ");
		}
		b = sc.nextInt();

		
		//Сравнение и результат
		if (a < b) {
			System.out.println("A < B, результат 7");
		}
		if (a > b) {
			System.out.println("A > B, результат 8");
		}
		if (a == b) {
			System.out.println("A = B, без результата");
		}
	}
}