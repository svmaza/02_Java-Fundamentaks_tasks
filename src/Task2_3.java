import java.util.*;

public class Task2_3 {
	public static void main(String[] args) {

		long a = 0;

		Scanner sc = new Scanner(System.in);

		// Проверка на корректный ввод числа (тип данных, переполнение)
		System.out.print("Введите целое число в байтах: ");
		while (!sc.hasNextLong()) {
			System.out.println("Ввод не корректен: не соответствует тип данных или граница диапазона.");
			sc = new Scanner(System.in);
			System.out.print("Введите целое число в байтах: ");
		}
		a = sc.nextLong();
		
		//Вывод результата
		System.out.println(a + " байт = " + (a / 1024) + " КБ");
		System.out.println(a + " байт = " + (a / Math.pow(1024, 2)) + " МБ");
		System.out.println(a + " байт = " + (a / Math.pow(1024, 3)) + " ГБ");
	}
}