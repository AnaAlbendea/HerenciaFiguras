package modelo;

public class Rombo extends Figura {
	
	private double dMayor;
	private double dMenor;
	
	public Rombo(double x, double y, double dMayor, double dMenor) {
		super(x, y);
		this.dMayor = dMayor;
		this.dMenor = dMenor;
	}

	public double area() {
		return dMayor * dMenor / 2;
	}

	public double perimetro() {
		return Math.sqrt(Math.pow(dMayor/2, 2) + Math.pow(dMenor/2, 2)) * 4;
	}

	public double getdMayor() {
		return dMayor;
	}

	public void setdMayor(double dMayor) {
		this.dMayor = dMayor;
	}

	public double getdMenor() {
		return dMenor;
	}

	public void setdMenor(double dMenor) {
		this.dMenor = dMenor;
	}

	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Rombo otro = (Rombo)o;
		return this.dMayor == otro.dMayor && this.dMenor == otro.dMenor;
	}

	@Override
	public String toString() {
		return "Rombo [" + getX() + ", " + getY() + ", " + dMayor + ", " + dMenor + "]";
	}
	
	
}
