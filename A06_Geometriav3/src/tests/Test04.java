package tests;

import modelo.Circulo;
import modelo.Rectangulo;

public class Test04 {
	public static void main(String[] args) {
		Circulo c1 = new Circulo(1, 2, 3);
		Circulo c2 = new Circulo(1, 2, 3);
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		
		Rectangulo r1 = new Rectangulo(1,2,3,4);
		Rectangulo r2 = new Rectangulo(1,2,5,6);
		Rectangulo r3 = new Rectangulo(1,2,3,4);
		
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
		
		System.out.println(r1.toString());
		System.out.println(r1);
		
		System.out.println(c2);
		
		System.out.println(c2.getX() + " - " + c2.getRadio());
		c1.setRadio(c1.getRadio() * 1.5);
		System.out.println(c1);
	}
}
