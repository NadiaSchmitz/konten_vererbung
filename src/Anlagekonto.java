
public class Anlagekonto extends Konto {
	
	protected double zinsensatz;
	
	public Anlagekonto(String kontonummer, double kontozustand) {
		super(kontonummer, kontozustand);
	}
	
	public Anlagekonto(String kontonummer, double kontozustand, double zinsensatz) {
		super(kontonummer, kontozustand);
		this.zinsensatz = zinsensatz;
	}

	public void kontoInfo() {
		System.out.printf(" %-15s %-15s %-15s %-15s", "Kontonummer", "Kontozustand", "Kontotyp", "Zinsensatz");
		System.out.println();
		System.out.printf(" %-15s %-15s %-15s %-15s", kontonummer, kontostand, "Anlagekonto", zinsensatz);
		System.out.println();
		System.out.println();
	}

}
