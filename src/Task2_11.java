import java.util.*;

public class Task2_11 {
	public static void main(String[] args) {

		float a = 0;
		float b = 0;
		float h = 0;
		float start = 0;
		float end = 0;
		float y = 0;

		Scanner sc = new Scanner(System.in);

		// Проверка на корректный ввод значения a
		System.out.print("Введите первое значение координаты отрезка [a, b]: ");
		while (!sc.hasNextFloat()) {
			System.out.println("Введённое значение не соответствует типу данных Float.");
			sc = new Scanner(System.in);
			System.out.print("Введите первое значение координаты отрезка [a, b]: ");
		}
		a = sc.nextFloat();

		// Проверка на корректный ввод значения b
		System.out.print("Введите второе значение координаты отрезка [a, b]: ");
		while (!sc.hasNextFloat()) {
			System.out.println("Введённое значение не соответствует типу данных Float.");
			sc = new Scanner(System.in);
			System.out.print("Введите второе значение координаты отрезка [a, b]: ");
		}
		b = sc.nextFloat();

		// Проверка на корректный ввод значения h
		System.out.print("Введите значение шага на отрезке [a, b]: ");
		while (!sc.hasNextFloat()) {
			System.out.println("Введённое значение не соответствует типу данных Float.");
			sc = new Scanner(System.in);
			System.out.print("Введите значение шага на отрезке [a, b]: ");
		}
		h = sc.nextFloat();

		
		//Поиск начальной и конечной точек отрезка
		if (a < b) {
			start = a;
			end = b;
		}else {
			start = b;
			end = a;
		}
		
		//Выполнение и результат
		while(start <= end) {
			if (start > 2 || start == 0) { //если не проверить на 0, то у = (-0), что не корректно
				y = start;
			}else {
				y = -start;
			}
			
			System.out.println("X = " + start + ", Y = " + y);
			start = start + h;
		}
	}
}