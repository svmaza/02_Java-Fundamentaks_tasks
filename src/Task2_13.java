import java.util.*;

public class Task2_13 {
	public static void main(String[] args) {

		int a = 0;
		int sum = 0;

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
				if((sum + i) < 0) {
					System.out.println("Значение суммы превышает границу диапазона данных. \nДальнейший расчёт невозможен.");
					System.out.println("Предельный результат: ");
					a = i;
					break;
				}
				sum = sum + i;
			}
			System.out.println("Сумма чисел от 1 до " + a + " равна " + sum);
		} else {
			System.out.println("Введённое значение не положительное.");
		}
	}
}