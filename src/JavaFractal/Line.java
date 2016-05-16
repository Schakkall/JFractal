package JavaFractal;

public class Line {
	private double x1, x2, y1, y2;
	
	public Line(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public Line(String str) {
		String[] parts = str.split(",");
		this.x1 = Double.parseDouble(parts[0]);
		this.y1 = Double.parseDouble(parts[1]);
		this.x2 = Double.parseDouble(parts[2]);
		this.y2 = Double.parseDouble(parts[3]);
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	} 	
	
	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}
	
	public String toString() {
		return " x1 " + Double.toString(x1) + " y1 " + Double.toString(y1) + " x2 " + Double.toString(x2) + " y2 " + Double.toString(y2);
	}

}
