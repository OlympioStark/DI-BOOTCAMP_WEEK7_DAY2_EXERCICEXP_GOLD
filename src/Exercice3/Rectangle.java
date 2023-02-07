package Exercice3;

public class Rectangle {

	private int length;
	private int breadth;

	public Rectangle() {
		this.length = 0;
		this.breadth = 0;
	}

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle{" + "length=" + length + ", breadth=" + breadth + '}';
	}

}
