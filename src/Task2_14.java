import java.util.*;

public class Task2_14 {
	public static void main(String[] args) {

		int a = 0;
		int factorial = 1;

		Scanner sc = new Scanner(System.in);

		// проверка на корректный ввод числа
		System.out.print("Введите целое положительное число: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите целое положительное число: ");
		}
		a = sc.nextInt();

		
		
		if (a > 0) {
			for (int i = 1; i <= a; i++) {
				if((factorial * i) < 0) {
					System.out.println("Значение факториала превышает границу диапазона данных. \nДальнейший расчёт невозможен.");
					System.out.println("Предельный результат: ");
					a = i;
					break;
				}
				factorial = factorial * i;
			}
			System.out.println("Факториал числа " + a + " равен " + factorial);
		} else {
			System.out.println("Введённое значение не положительное.");
		}
	}
}
