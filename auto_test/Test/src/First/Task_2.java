package First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {

public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a = ");
		String sa = reader.readLine();
        int a = Integer.parseInt(sa);
		
        System.out.println("Enter b = ");
		String sb = reader.readLine();
        int b = Integer.parseInt(sb);
        
        System.out.println("Enter c = ");
		String sc = reader.readLine();
        int c = Integer.parseInt(sc);
        
        System.out.println("Enter d = ");
		String sd = reader.readLine();
        int d = Integer.parseInt(sd);
		
		double triangle = (Math.sqrt(3) / 4) * Math.pow(a, 2); //15,588
		double circle = Math.PI * (d / 2); // 3.141592653589793
		double rectangle = b * c; // 6
		
		double pl = (3 * triangle) + (3 * circle) + rectangle;
		
		System.out.println("Area of the figure = " + pl);

	}

}
