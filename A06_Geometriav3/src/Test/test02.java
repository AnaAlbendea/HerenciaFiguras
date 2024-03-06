package Test;
import modelo.Circulo;
import modelo.Rectangulo;
public class test02 {

	public static void main(String[]args) {
		Rectangulo r=new Rectangulo(1,2,3,4);
		Circulo c=new Circulo(0,-2.5,10);
		System.out.println("area r:"+r.area());
		System.out.println("area c"+c.area());
		
	}
}
