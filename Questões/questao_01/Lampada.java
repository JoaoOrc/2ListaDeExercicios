package questao_01;

public class Lampada {
	static boolean ligada;

	public static void main(String[] arg) {

		 liga();
		//desliga();
		observar();
	}

	static void liga() {
		ligada = true;
	}

	static void desliga() {
		ligada = false;
	}

	static public String observar() {
		if (ligada) {
			System.out.println("Ligada");
			return "Ligada";
		} else {
			System.out.println("Desligada");
			return "Desligada";
		}
	}
}
