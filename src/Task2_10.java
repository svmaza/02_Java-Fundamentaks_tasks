import java.util.*;

public class Task2_10 {
	public static void main(String[] args) {
	
		int i = 2;
		int j = 100;
	
		System.out.println("Чётные числа в пределах от " + i + " до " + j + ": ");
		
		while(i <= j){
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
}