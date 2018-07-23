package First;

/**
 * This program calculates the area of the figures (2 - triangles, 1 - trapeze, 3 -circle).  
 * 
 * @author пк
 */

import java.io.IOException;
import java.util.Scanner;

public class Task_1_1 {

	public static void main(String[] args) throws IOException {
		
		/**
		 * Создаем объект scanner_a, который относиться к классу Scanner. В его конструктор передаем объект System.in.
		 * После этого можем получать вводимые значения из консоли.
		 * Выводим на консоль текст "Enter a = " для ввода значения переменной.
		 * Далее переменной "а" присваивается значение double, которое ввели через консоль, используя метод nextDouble().
		 * 
		 */
		
		Scanner scanner_a = new Scanner(System.in);
		System.out.println("Enter a = ");
		double a = scanner_a.nextDouble(); 
			
		Scanner scanner_b = new Scanner(System.in);
		System.out.println("Enter b = ");
		double b = scanner_b.nextDouble();
				
		Scanner scanner_c = new Scanner(System.in);
		System.out.println("Enter c = ");
		double c = scanner_c.nextDouble();
				
		Scanner scanner_d = new Scanner(System.in);
		System.out.println("Enter d = ");
		double d = scanner_d.nextDouble();
		
		scanner_a.close(); //метод, который закрывает поток вводимых данных
		scanner_b.close();
		scanner_c.close();
		scanner_d.close();
				
		double triangle1 = 0.5 * b * c; // Площадь треугольника_1 = 0.5 * 4 * 5 = 10
		
		double triangle2 = 0.5 * b * (c + d); // Площадь треугольника_2 = 0.5 * 4 * (5 + 2) = 14
		
		double circle = Math.PI * (d / 2); // Площадь круга = 3.141592653589793 * 1
		
		double trapeze = (0.5 * a * ((2 * b) + (4 * b))) - (3 * circle); // Площадь трапеции минус три площади круга = 0.5 * 4 (8 + 16) - (3 * 3.141592653589793) = 38,575222039230624
		
		double pl = triangle1 + triangle2 + trapeze;
                       
		System.out.println("Area of the figure = " + pl);
	}
}
