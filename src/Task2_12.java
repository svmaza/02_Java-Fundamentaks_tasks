import java.util.*;

public class Task2_12 {
	public static void main(String[] args) {
		
		char a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите любой символ: ");
		a = sc.next().charAt(0);
		
		System.out.println("Символ \'" + a + "\' - соответствует значению " + (int)a + " таблицы кодов ASCII");
	}
}