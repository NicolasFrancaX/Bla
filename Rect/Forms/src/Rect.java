
public class Rect {
	// Atributos
	private double width;
	private double height;
	
	// Construtor
	public Rect(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rect() { }
	
	// Getters & Setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	// Métodos
	public double area() {
		return this.width * this.height;
	}

	public double perimeter() {
		return 2 * (this.width + this.height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2));
	}
}
