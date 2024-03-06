package Test;
import modelo.Circulo;
import modelo.Rectangulo;
public class Test04 {

	public static void main(String[] args) {
		Circulo c1= new Circulo(1,2,3);
		Circulo c2=new Circulo(1,2,3);
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2)); //esto no te dice si es igual hay que sobreecribir el metodo equals.

		
		Rectangulo r1=new Rectangulo(1,2,3,4);
		Rectangulo r2=new Rectangulo(1,2,5,6);
		Rectangulo r3=new Rectangulo(1,2,3,4);
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
		System.out.println(r1.toString());
		System.out.println(r1);
		System.out.println(c2);
//		System.out.println(c2.getX()+"-"+c2.getradio());
		
	}
}
//a.equals(a) debe devolver true
//a.equals (null) a nunca puede ser null, siempre devolverar false;

//a.equals (b) si esto devulve true
//b.equal (a) esto tambien tiene que delvolver true,

//metodo toString es de la clase object no sale bien. hay sobreescribir.
