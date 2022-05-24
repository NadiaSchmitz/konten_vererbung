
public class Tagesgeldkonto extends Anlagekonto {

	public Tagesgeldkonto(String kontonummer, double kontozustand, double zinsensatz) {
		super(kontonummer, kontozustand, zinsensatz);
	}
	
	public void kontoInfo() {
		System.out.printf(" %-15s %-15s %-15s %-15s %-15s", "Kontonummer", "Kontozustand", "Kontotyp", "Kontokategorie", "Zinsensatz");
		System.out.println();
		System.out.printf(" %-15s %-15s %-15s %-15s %-15s", kontonummer, kontostand, "Anlagekonto", "Tagesgeldkonto", zinsensatz);
		System.out.println();
		System.out.println();
	}
	
}
