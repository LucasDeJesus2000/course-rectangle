package entities;

public class Rectangle {
	public double Width;
	public double Height;
	
	public double area() {
		return Width * Height;
	}
	
	public double perimeter() {
		return 2 * (Width + Height);
	}
	
	public double diagonal() {
		double d1 = Math.pow(Width, 2);
		double d2 = Math.pow(Height, 2); 
		double d3 = d1 + d2;
		double d4 = Math.sqrt(d3);
		return d4;
	}
	public String toString() {
		return "\nAREA = " 
				+ String.format("%.2f", area())
				+"\nPERIMETER = "
				+ String.format("%.2f", perimeter())
				+"\nDIAGONAL = "
				+ String.format("%.2f", diagonal());
	}
}