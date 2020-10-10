import java.util.*;

public class Task2_1 {
	public static void main(String[] args) {
		
		double a = 0;
		double b = 0;
		double c = 0;
		double result;
		
		Scanner sc = new Scanner(System.in);
		
		//проверка на корректный ввод числа а
		System.out.print("Введите число а: ");
		while(!sc.hasNextDouble()) {
			System.out.println("Введено не числовое значение.");
			sc = new Scanner(System.in);
			System.out.print("Введите число а: ");
		}
		a = sc.nextDouble(); 
		
		//проверка на корректный ввод числа b
		System.out.print("Введите число b: ");
		while(!sc.hasNextDouble()) {
			System.out.println("Введено не числовое значение.");
			sc = new Scanner(System.in);
			System.out.print("Введите число b: ");
		}
		b = sc.nextDouble(); 
		
		//проверка на корректный ввод числа c
		System.out.print("Введите число c: ");
		while(!sc.hasNextDouble()) {
			System.out.println("Введено не числовое значение.");
			sc = new Scanner(System.in);
			System.out.print("Введите число c: ");
		}
		c = sc.nextDouble(); 
	
		//Расчёт
		result = (b + Math.sqrt(Math.pow(b, 2) + (4 * a * c))) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
		System.out.println("Результат = " + result);	
	}
}