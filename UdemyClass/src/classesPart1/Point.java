package classesPart1;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distance() {
		return Math.sqrt((double) (this.x - 0.0D) * (this.x - 0.0D) + (this.y - 0.0D) * (this.y - 0.0D) );
	}
	
	public double distance(int x, int y) {
		return Math.sqrt((double) (this.x - x) * (this.x - x) + (this.y - y) * (this.y - y) );
	}
	
	public double distance(Point point) {
		return Math.sqrt((double) (this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y) );
	}
}
