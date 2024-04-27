package lab01;
import java.util.Scanner;

public class NumberOperator {
	public static double input() {
		Scanner inp = new Scanner(System.in);
		double num = inp.nextDouble();
		
		return (num);
		
	}
	
	public static double Sum(double num1, double num2) {
		return (num1 + num2);
	}
	
	public static double Difference(double num1, double num2) {
		return (Math.abs(num2 - num2));
	}
	
	public static double Product(double num1, double num2) {
		return (num1 * num2);
	}
	
	public static double Quotient(double num1, double num2) {
		if (num2 != 0) {
			return (num1 / num2);
		}
		else {
			System.out.println("Invalid");
			return (0);
		}
	}	

	public static void main(String[] args) {
		System.out.println("First number:");
		double num1 = input();
		System.out.println("Second number:");
		double num2 = input();
		
		System.out.println("Sum:  " + String.valueOf(Sum(num1, num2)));
		System.out.println("Difference:  " + String.valueOf(Difference(num1, num2)));
		System.out.println("Product:  " + String.valueOf(Product(num1, num2)));
		System.out.println("Quotient:  " + String.valueOf(Quotient(num1, num2)));
	}
}
