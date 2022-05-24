
public class Festgeldkonto extends Anlagekonto {

	private int laufzeit;
	
	public Festgeldkonto(String kontonummer, double kontozustand, double zinsensatz, int laufzeit) {
		super(kontonummer, kontozustand, zinsensatz);
		this.laufzeit = laufzeit;
	}
	
	public void kontoInfo() {
		System.out.printf(" %-15s %-15s %-15s %-15s %-15s %-15s", "Kontonummer", "Kontozustand", "Kontotyp", "Kontokategorie", "Zinsensatz", "Laufzeit");
		System.out.println();
		System.out.printf(" %-15s %-15s %-15s %-15s %-15s %-15s", kontonummer, kontostand, "Anlagekonto", "Festgeldkonto", zinsensatz, laufzeit);
		System.out.println();
		System.out.println();
	}

}
