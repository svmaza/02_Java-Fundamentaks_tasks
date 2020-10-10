import java.util.*;

public class Task2_9 {
	public static void main(String[] args) {

		double x = 0;
		double Fx;

		Scanner sc = new Scanner(System.in);

		// Проверка на корректный ввод значения x
		System.out.print("Введите x: ");
		while (!sc.hasNextDouble()) {
			System.out.println("Введённое значение не соответствует вещественному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите x: ");
		}
		x = sc.nextDouble();

		
		//Вычисление и результат
		if (x <= 3) {
			Fx = (x * x) - (3 * x) + 9;
		} else {
			Fx = 1 / (Math.pow(x, 3) + 6);
		}

		System.out.println("F(x)=" + Fx);
	}
}
