package tests;

import modelo.Rombo;

public class Test05 {
	public static void main(String[] args) {
		Rombo r = new Rombo(1, 2, 8, 6);
		System.out.println(r);
		System.out.println("Area: " + r.area());
		System.out.println("Perimetro: " + r.perimetro());
		
		
		System.out.println(r.equals("hola que tal"));
	}
}
