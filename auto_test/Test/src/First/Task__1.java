package First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task__1 {

	public static void main(String[] args) throws IOException {
		
		//Создаем буферный поток ввода символов reader, в который встраиваем входящий поток данных.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.println("Enter a = ");
		String sa = reader.readLine();     // считываем строку
		double a = Double.parseDouble(sa); // преобразовываем строку в тип данных double
		
        System.out.println("Enter b = ");
		String sb = reader.readLine();
		double b = Double.parseDouble(sb);
        
        System.out.println("Enter c = ");
		String sc = reader.readLine();
		double c = Double.parseDouble(sc);
        
        System.out.println("Enter d = ");
		String sd = reader.readLine();
		double d = Double.parseDouble(sd);
		
        double triangle1 = 0.5 * b * c; // 0.5 * 4 * 5 = 10
		
		double triangle2 = 0.5 * b * (c + d); // 0.5 * 4 * (5 + 2) = 14
		
		double circle = Math.PI * (d / 2); // 3.141592653589793
		
		double trapeze = (0.5 * a * ((2 * b) + (4 * b))) - (3 * circle); // 0.5 * 4 (8 + 16) - (3 * 3.141592653589793) = 38,575222039230624
		
		double pl = triangle1 + triangle2 + trapeze;
                       
		System.out.println("Area of the figure = " + pl);

	}

}
