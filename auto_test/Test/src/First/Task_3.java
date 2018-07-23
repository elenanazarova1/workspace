package First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {

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
