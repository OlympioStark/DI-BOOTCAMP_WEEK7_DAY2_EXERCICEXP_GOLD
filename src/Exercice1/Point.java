package Exercice1;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		super();
	}
	
	public Point (int x, int y) {
		super();
		this.x =x;
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
	
	@Override
	public String toString () {
		return "(" + x + ", " + y + ")";
	}

	public int[] getXY() {
		return new int[] {getX(), getY()};
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(int x, int y) {
		double dist = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
		
		return dist;
	}
	
    public double distance (Point anotherPoint) {
    	return Math.sqrt(Math.pow((anotherPoint.x - x), 2) + Math.pow((anotherPoint.y - y), 2));
    }
    
    public double distance () {
    	return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }
}
