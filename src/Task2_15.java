import java.util.*;

public class Task2_15 {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int count = 1;
		int nod = 1;

		Scanner sc = new Scanner(System.in);

		// проверка на корректный ввод числа a
		System.out.print("Введите целое число a: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите целое число a: ");
		}
		a = sc.nextInt();

		// проверка на корректный ввод числа b
		System.out.print("Введите целое число b: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите целое число b: ");
		}
		b = sc.nextInt();
		
		
		
		//1. Нахождение НОД подбором в цикле
		System.out.print("\n1. Вычисление НОД методом подбора.\n");
		
		if (a <= b) {
			nod = a;
		}else {
			nod = b;
		}
		
		while((a % nod != 0) || (b % nod != 0)){
			count = count + 1;
			nod--;
		}
		System.out.println("НОД чисел a и b равен " + nod);
		System.out.print("Вычисление НОД по методу подбора произведено за " + count + " итераций\n");
		
		
		
		//2. Нахождение НОД методом Евклида
		count = 0;
		System.out.print("\n2. Вычисление НОД по методу Евклида.\n");
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
			count = count + 1;
		}
		System.out.println("НОД чисел a и b равен " + (a + b));
		System.out.print("Вычисление НОД по методу Евклида произведено за " + count + " итераций\n");
	}
}