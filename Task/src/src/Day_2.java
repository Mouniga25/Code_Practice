//22/2/2025
package src;
import java.util.Scanner;

public class Day_2 {
	public static void main(String[] args) {
		int number;
		System.out.print("enter the number is:");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		scanner.close();
		int fact = 1;
		for (int i=number; i>=1;i--){
			
			  fact *=i;		
		}
		System.out.print("the factorial:" + fact);	
	}
	
}

