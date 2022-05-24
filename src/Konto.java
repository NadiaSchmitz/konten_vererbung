
public class Konto {

	protected String kontonummer;
	protected double kontostand;
	
	public Konto(String kontonummer, double kontostand) {
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
	}

	public void kontoInfo() {
		System.out.printf(" %-15s %-15s", "Kontonummer", "Kontozustand");
		System.out.println();
		System.out.printf(" %-15s %-15s", kontonummer, kontostand);
		System.out.println();
		System.out.println();
	}
	
}
