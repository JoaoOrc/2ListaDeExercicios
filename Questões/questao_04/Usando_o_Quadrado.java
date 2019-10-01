package questao_04;

public class UsaQuadrado {

	public static void main(String[] args) {

		Quadrado q1, q2, q3;
		q1 = new Quadrado(2);
		q2 = new Quadrado(4);
		q3 = new Quadrado(5);

		System.out.println(q1.area() + " " + q1.perimetro());
		System.out.println(q2.area() + " " + q2.perimetro());
		System.out.println(q3.area() + " " + q3.perimetro());

	}
}
