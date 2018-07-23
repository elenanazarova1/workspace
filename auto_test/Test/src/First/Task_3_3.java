package First;

import java.io.IOException;
import java.util.Scanner;

public class Task_3_3 {

	public static void main(String[] args) throws IOException {
		
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
		
		double r_little = d / 2; // 0.5
        double s_little_cylinder = ((2 * Math.PI * r_little * b) + (Math.PI * Math.pow(r_little,2))); //
        
        double r_big = a - (2 * d);
        double s_big_cilinder = (2 * Math.PI * r_big * b) + ((Math.PI * Math.pow(r_big,2)) - (2 * (Math.PI * Math.pow(r_little,2))));
        
        double r_cone = c / 2;
        double r = r_big - r_cone;
        double l_cone = Math.sqrt((Math.pow(d,2) + Math.pow(r, 2)));
        double s_cone = Math.PI *  (r_big + r_cone) * l_cone;
        
        double s = (2 * s_little_cylinder) + s_big_cilinder + s_cone;
        
        System.out.println("Area of the figure = " + s);

	}

}
