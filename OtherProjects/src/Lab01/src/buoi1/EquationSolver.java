package buoi1;
import java.util.Scanner;

public class EquationSolver {
	
	public static void firstDegree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coefficients (a,b):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Solving the equation: " + a + "x + " + b +" = 0 ...");
		if (a == 0) {
			System.out.println("No solution");
		}
		else {
			System.out.println("solution: x =  " + b/a);
		}	
	}
	
	public static void firstDegreeSystem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coefficients (a11, a12, b1, a21, a22, b2):");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        
        System.out.println("Solving the equation: ");
        System.out.println(a11 + "x1 + " + a12 +" = " + b1 );
        System.out.println(a21 + "x2 + " + a22 +" = " + b2 );
	    double D;
	    double D1;
	    double D2;
	    D = a11 * a22 - a21 * a12;
	    D1 = b1 * a22 - b2 * a12;
	    D2 = a11 * b2 - a21 * b1;
	    if (D != 0) {
		    System.out.println("Solution: ");
		    System.out.println("x1 = " + D1/D);
		    System.out.println("x2 = " + D2/D);
	    } else if (D==0) {
	    	if (D1 == 0 && D2 == 0) {
	    		System.out.println("Infinite solution");
	    	} else {
		    	System.out.println("No solution");
	    	}
	    	
	    }

	}
	
	public static void secondDegree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println("Solving the equation: " + a + "x^2 + " + b + "x + " + c+ " = 0 ...");
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Roots are different.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are same.");
            System.out.println("Root = " + root);
        } else {
        	System.out.println("No real solution");
        }
    }
        
    public static void main(String[] args) {
    	System.out.println("1. firstDegree");
    	System.out.println("2. firstDegreeSystem");
    	System.out.println("3. secondDegree");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
        	case 1:
        		firstDegree();
        		break;
        	case 2:
        		firstDegreeSystem();
        		break;
        	case 3:
        		secondDegree();
        		break;
        		
        }
    }
}



