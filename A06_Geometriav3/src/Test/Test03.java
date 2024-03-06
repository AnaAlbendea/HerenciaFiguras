package Test;
import modelo.Rectangulo;

import modelo.Figura;
import modelo.Circulo;
public class Test03 {
	public static void main(String[]args) {
		Rectangulo r1=new Rectangulo(1,2,3,4);
		Rectangulo r2=new Rectangulo(4,5,2,56);
		Circulo c1=new Circulo(0, 0.5, 10);
		Figura[] figs=new Figura[5];
		figs[0]= r1;
		figs[1]= r2;
		figs[2]= c1;
		figs[3]= new Rectangulo(5,5,8,2);
		figs[4]= new Circulo(1,1,5);
		System.out.println(sumaAreas(figs));
	}
	public static double sumaAreas(Figura[] figuras) {
		double areas=0;
		for (int i=0; i<figuras.length; i++) {
			areas+=figuras[i].area();
		}
	
		return areas;
	}
}

/// objeto dios en Java cualquier clase desciende objeto

// con una