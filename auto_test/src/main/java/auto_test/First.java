package auto_test;

public class First {

	
	 public static void main(String[] args) {
	 
		
		Distance d = new Distance(5, 7);
				
		System.out.println("Расстояние между двумя точками Point p1 = " + d.x + " и Point p2 = " + d.y + " равно " + d.distance());
		
		
		Square s = new Square(6);
		
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.square());
		
		
		Rectangle r = new Rectangle(3, 8);
		
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.rectangle());
		
	}

}