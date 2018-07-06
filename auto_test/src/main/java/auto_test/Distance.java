package auto_test;

public class Distance {
	
	public double x;
	public double y;

	public Distance(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance() {
	
		return Math.sqrt((this.x * this.x) + (this.y * this.y));
	}
	
}
