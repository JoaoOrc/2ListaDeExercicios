package questao2;

class Lampada_02 {

	private boolean ligada;

	public Lampada2() {
		this.ligada = false; 
	}

	public void ligar() {
		this.ligada = true;
	}

	public void desligar() {
		ligada = false; 
	}

	public String observa() {
		if (ligada) {
			return "Ligada";
		} else {
			return "Desligada";
		}
	}

	public static void main(String[] argv) {

		Lampada2 lamp1 = new Lampada2();
		Lampada2 lamp2 = new Lampada2();

		lamp1.ligar();
		lamp2.desligar();
		
		System.out.println("Lampada 1: " + lamp1.observa() + "\nLampada 2: " + lamp2.observa());
	}

}


