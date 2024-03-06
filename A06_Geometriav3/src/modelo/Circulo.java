package modelo;

public class Circulo extends Figura {

	private double radio;
	
	public Circulo(double x, double y, double radio) {
		super(x,y);
		this.radio = radio;
	}
	
	public double area() {
		return Math.PI * radio * radio;
	}
	
	public double perimetro() {
		return Math.PI * 2 * radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		Circulo otro = (Circulo)o;
		return this.radio == otro.radio;
	}
	
	public String toString() {
		return "Circulo[" + getX() + ", " + getY() + ", " + radio + "]";
	}
}
