package auto_test;

public class First {

	
	 public static void main(String[] args) {
	 
		
		Distance d = new Distance(5, 7);
				
		System.out.println("���������� ����� ����� ������� Point p1 = " + d.x + " � Point p2 = " + d.y + " ����� " + d.distance());
		
		
		Square s = new Square(6);
		
		System.out.println("������� �������� �� �������� " + s.l + " = " + s.square());
		
		
		Rectangle r = new Rectangle(3, 8);
		
		System.out.println("������� �������������� �� ��������� " + r.a + " � " + r.b + " = " + r.rectangle());
		
	}

}