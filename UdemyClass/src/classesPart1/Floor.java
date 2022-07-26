package classesPart1;

public class Floor {
	
	private double width;
	private double length;
	
	public Floor(double width, double length) {
		if(width < 0) {
			this.width = 0.0D;
		} else {
			this.width = width;
		}
		if(length < 0) {
			this.length = 0.0D;
		} else {
			this.length = length;
		}
	}
	
	public double getArea() {
		return this.width * this.length;
	}
}
