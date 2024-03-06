package modelo;

public abstract class Figura  {

	private int parteEnteraX;
	private double parteDecimalX;
	private double y;
	
	public Figura(double x, double y) {
		parteEnteraX = (int)x;
		parteDecimalX = x - parteEnteraX;
		this.y = y;
	}
	
	public Figura() {}
	
	public abstract double area();
	
	public abstract double perimetro();
	
	
	public double getX() {
		return parteEnteraX + parteDecimalX;
	}
	
	public void setX(double x) {
		parteEnteraX = (int)x;
		parteDecimalX = x - parteEnteraX;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public int getParteEnteraX() {
		return parteEnteraX;
	}
	
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this == o) return true;
		if (this.getClass() != o.getClass()) return false;
		Figura otra = (Figura)o;
		return this.getX() == otra.getX() && this.y == otra.y;
	}
}
