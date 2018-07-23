package First;

import java.io.IOException;
import java.util.Scanner;

public class Test_2_2 {

	public static void main(String[] args)  throws IOException {
		
		/**
		 * ������� ������ scanner_a, ������� ���������� � ������ Scanner. � ��� ����������� �������� ������ System.in.
		 * ����� ����� ����� �������� �������� �������� �� �������.
		 * ������� �� ������� ����� "Enter a = " ��� ����� �������� ����������.
		 * ����� ���������� "�" ������������� �������� double, ������� ����� ����� �������, ��������� ����� nextDouble().
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
		
		scanner_a.close();
		scanner_b.close();
		scanner_c.close();
		scanner_d.close();
		
		double triangle = (Math.sqrt(3) / 4) * Math.pow(a, 2); //15,588
		double circle = Math.PI * (d / 2); // 3.141592653589793
		double rectangle = b * c; // 6
		
		double pl = (3 * triangle) + (3 * circle) + rectangle;
		
		System.out.println("Area of the figure = " + pl);

	}

}
